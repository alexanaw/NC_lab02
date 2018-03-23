package dao.rows;

import lombok.Data;

import java.util.Date;

@Data
public class ParametersRow {
    private Long id;
    private Long attributesId;
    private String name;
    private Date birthday;
    private String passport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttributesId() {
        return attributesId;
    }

    public void setAttributesId(Long attributesId) {
        this.attributesId = attributesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
