package dao.rows.rowMappers;

import dao.rows.TypesRow;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import static lombok.AccessLevel.PUBLIC;

@NoArgsConstructor(access = PUBLIC)
public class TypesRowMapper implements RowMapper<TypesRow> {
    @Override
    public TypesRow mapRow(ResultSet rs, int rowNum) throws SQLException {
        TypesRow types = new TypesRow();
        types.setTypeId(rs.getLong("type_id"));
        types.setParentId(rs.getLong("parent_id"));
        types.setPosition(rs.getString("position"));
        return types;
    }
}