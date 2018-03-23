package dao.rows;

import lombok.Data;

@Data
public class ObjectsRow {
    private Long id;
    private Long typesId;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypesId() {
        return typesId;
    }

    public void setTypesId(Long typeId) {
        this.typesId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
