package dao.rows.rowMappers;

import dao.rows.AttributesRow;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

    import static lombok.AccessLevel.PUBLIC;

    @NoArgsConstructor(access = PUBLIC)
    public class AttributesRowMapper implements RowMapper<AttributesRow> {
        @Override
        public AttributesRow mapRow(ResultSet rs, int rowNum) throws SQLException {
            AttributesRow attributes = new AttributesRow();
            attributes.setAttributesId(rs.getLong("attributes_id"));
            attributes.setTypeId(rs.getLong("type_id"));
            attributes.setExperience(rs.getString("experience"));
            return attributes;
        }
    }