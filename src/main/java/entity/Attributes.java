package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attributes")
public class Attributes {

    @Id
    @Column(name = "type_id")
    public Long type_id;

    @Id
    @Column(name = "attributes_id")
    private Long attributes_id;

    @Column(name = "experience")
    private String experience;

    public Attributes(int i, int i1, String jj) {
    }

    public Long getAttributes_id() {
        return attributes_id;
    }

    public void setAttributes_id(Long attributes_id) {
        this.attributes_id = attributes_id;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        entity.Attributes that = (entity.Attributes) o;

        if (attributes_id != null ? !attributes_id.equals(that.attributes_id) : that.attributes_id != null)
            return false;
        if (type_id != null ? !type_id.equals(that.type_id) : that.type_id != null) return false;
        return experience != null ? experience.equals(that.experience) : that.experience == null;
    }

    @Override
    public int hashCode() {
        int result = attributes_id != null ? attributes_id.hashCode() : 0;
        result = 31 * result + (type_id != null ? type_id.hashCode() : 0);
        result = 31 * result + (experience != null ? experience.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "attributes_id=" + attributes_id +
                ", type_id=" + type_id +
                ", experience='" + experience + '\'' +
                '}';
    }
}