package models;

import java.util.Objects;

public class Medicine {
    private long id;
    private long firstAidKit;
    private String name;
    MedicineType type;
    int dosage;
    int quantity;
    String expiryDate;

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

    public MedicineType getType() {
        return type;
    }

    public void setType(MedicineType type) {
        this.type = type;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicine medicine = (Medicine) o;
        return getId() == medicine.getId() && getFirstAidKit() == medicine.getFirstAidKit()
                && getDosage() == medicine.getDosage()
                && getQuantity() == medicine.getQuantity()
                && getName().equals(medicine.getName())
                && getType() == medicine.getType()
                && getExpiryDate().equals(medicine.getExpiryDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getFirstAidKit(),
                getName(),
                getType(),
                getDosage(),
                getQuantity(),
                getExpiryDate());
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", firstAidKit=" + firstAidKit +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", dosage=" + dosage +
                ", quantity=" + quantity +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
