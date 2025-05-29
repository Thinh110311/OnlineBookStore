
package com.bookstore.model;

public class BookStoreCustomer {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String city;
    private String country;

    public BookStoreCustomer(int id, String name, String email, String phone, String city, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.country = country;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
}
