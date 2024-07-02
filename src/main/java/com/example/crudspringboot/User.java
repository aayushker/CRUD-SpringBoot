package com.example.crudspringboot;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Document is used when we want to store the object in the MongoDB database.
//@Entity is used when we want to store the object in the SQL database.
//In this case, we are using the SQL database, so we will use the @Entity annotation.
//tells the JPA that this class is an entity and is mapped to a database table.
@Entity
public class User {

    @Id
    private int id;
    private String name;
    private String email;
    private String address;
    private int phone;

    public User() {
        super();
    }

    public User(int id, String name, String email, String address, int phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
