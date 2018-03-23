package dao.rows.rowMappers;

import dao.rows.ParametersRow;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;

import static lombok.AccessLevel.PUBLIC;

@NoArgsConstructor(access = PUBLIC)
public class ParametersRowMapper implements RowMapper<ParametersRow> {
    @Override
    public ParametersRow mapRow(ResultSet rs, int rowNum) throws SQLException {
        ParametersRow parameters = new ParametersRow();
        parameters.setId(rs.getLong("id"));
        parameters.setAttributesId(rs.getLong("attributes_id"));
        parameters.setBirthday((Date) instantiateDate(rs.getTimestamp("birthday")));
        parameters.setPassport(rs.getString("passport"));
        return parameters;
    }

    private Object instantiateDate(Timestamp birthday) {
        if (birthday != null) return OffsetDateTime.ofInstant(birthday.toInstant(), ZoneId.systemDefault());
        return null;
    }
}