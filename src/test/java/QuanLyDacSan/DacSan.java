package QuanLyDacSan;

import java.util.Scanner;

public class DacSan{
    private int id;
    private String name;
    private String price;
    private String description;
    private String location;
    private String note;


    public DacSan(int id, String name, String price, String description, String location, String note) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
        this.note = note;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "DacSan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

}
