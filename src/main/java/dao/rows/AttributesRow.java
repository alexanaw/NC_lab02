package dao.rows;

import lombok.Data;

@Data
public class AttributesRow {
    private Long attributesId;
    private Long typeId;
    private String experience;


    public void setAttributesId(Long attributesId) {
        this.attributesId = attributesId;
    }

    public Long getAttributesId() {
        return attributesId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
