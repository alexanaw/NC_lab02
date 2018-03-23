package dao.rows.rowMappers;

import dao.rows.ObjectsRow;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static lombok.AccessLevel.PUBLIC;

@NoArgsConstructor(access = PUBLIC)
public class ObjectsRowMapper implements RowMapper<ObjectsRow> {
    @Override
    public ObjectsRow mapRow(ResultSet rs, int rowNum) throws SQLException {
        ObjectsRow objects = new ObjectsRow();
        objects.setId(rs.getLong("id"));
        objects.setTypesId(rs.getLong("type_id"));
        objects.setName(rs.getString("name"));
        return objects;
    }
}