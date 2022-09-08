package com.capstone.cartservice;

public class SingleCartItem {

    private Long user_id;
    private Long id;
    private String name;
    private String description;
    private double price;
    private double rating;

    public SingleCartItem() {
    }

    public SingleCartItem(Long user_id,Long id, String name, String description, double price, double rating) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
