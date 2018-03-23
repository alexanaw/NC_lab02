package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Parameters {

    @Id
    @Column(name = "id")
    public Long id;

    @Id
    @Column(name = "attributes_id")
    private Long attributes_id;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "passport")
    private String passport;

    public Parameters() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttributes_id() {
        return attributes_id;
    }

    public void setAttributes_id(Long attributes_id) {
        this.attributes_id = attributes_id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameters that = (Parameters) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (attributes_id != null ? !attributes_id.equals(that.attributes_id) : that.attributes_id != null)
            return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        return passport != null ? passport.equals(that.passport) : that.passport == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (attributes_id != null ? attributes_id.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "id=" + id +
                ", attributes_id=" + attributes_id +
                ", birthday=" + birthday +
                ", passport='" + passport + '\'' +
                '}';
    }
}
