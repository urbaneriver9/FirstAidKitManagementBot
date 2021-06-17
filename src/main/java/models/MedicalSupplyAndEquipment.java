package models;

import java.util.Objects;

public class MedicalSupplyAndEquipment {
    private long id;
    private long firstAidKit;
    private String name;
    private int quantity;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFirstAidKit() {
        return firstAidKit;
    }

    public void setFirstAidKit(long firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalSupplyAndEquipment that = (MedicalSupplyAndEquipment) o;
        return getId() == that.getId()
                && getFirstAidKit() == that.getFirstAidKit()
                && getQuantity() == that.getQuantity()
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getFirstAidKit(),
                getName(),
                getQuantity(),
                getDescription());
    }

    @Override
    public String toString() {
        return "MedicalSupplyAndEquipment{" +
                "id=" + id +
                ", firstAidKit=" + firstAidKit +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
