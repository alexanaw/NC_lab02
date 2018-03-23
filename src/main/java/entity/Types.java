package entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Types {

    @Id
    @Column(name = "type_id")
    public Long type_id;

    @Id
    @Column(name = "parent_id")
    private Long parent_id;

    @Column(name = "position")
    private String position;

    public Types() {
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id() {
        this.type_id = type_id;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Types types = (Types) o;

        if (type_id != null ? !type_id.equals(types.type_id) : types.type_id != null) return false;
        if (parent_id != null ? !parent_id.equals(types.parent_id) : types.parent_id != null) return false;
        return position != null ? position.equals(types.position) : types.position == null;
    }

    @Override
    public int hashCode() {
        int result = type_id != null ? type_id.hashCode() : 0;
        result = 31 * result + (parent_id != null ? parent_id.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Types{" +
                "type_id=" + type_id +
                ", parent_id=" + parent_id +
                ", position='" + position + '\'' +
                '}';
    }
}
