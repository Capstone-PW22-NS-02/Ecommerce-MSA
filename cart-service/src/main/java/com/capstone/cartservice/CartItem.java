package com.capstone.cartservice;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class CartItem {

    @Id
    private Long user_id;

//    @Column
//    @ElementCollection(targetClass=Product.class)
    @OneToMany
    private List<Product> products;
    public CartItem() {
        this.products = new ArrayList<Product>();
    }


    public CartItem(Long id, List<Product> products) {
        this.user_id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(Product item) {
        this.products.add(item);
    }
}
