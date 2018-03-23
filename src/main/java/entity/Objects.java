package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objects")
public class Objects {

    @Id
    @Column(name = "id")
    public Long id;

    @Id
    @Column(name = "type_id")
    public Long type_id;

    @Column(name = "name")
    private String name;

    public Objects() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objects objects = (Objects) o;

        if (id != null ? !id.equals(objects.id) : objects.id != null) return false;
        if (type_id != null ? !type_id.equals(objects.type_id) : objects.type_id != null) return false;
        return name != null ? name.equals(objects.name) : objects.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type_id != null ? type_id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Objects{" +
                "id=" + id +
                ", type_id=" + type_id +
                ", name='" + name + '\'' +
                '}';
    }
}
