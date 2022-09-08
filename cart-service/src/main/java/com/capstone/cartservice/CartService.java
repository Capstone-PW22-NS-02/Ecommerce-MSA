package com.capstone.cartservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CartService(CartRepository cartRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.productRepository = productRepository;
    }

    public CartItem getCartItems(Long id){
        return cartRepository.findById(id).orElse(null);
    }

    public String addCartItem(SingleCartItem singleCartItem){

        CartItem cartItem = cartRepository.findById(singleCartItem.getUser_id()).orElse(null);
        Product new_item = new Product(singleCartItem.getId(), singleCartItem.getName(), singleCartItem.getDescription(), singleCartItem.getPrice(), singleCartItem.getRating());
        productRepository.save(new_item);
        System.out.println(new_item.getId());
        if(cartItem == null){
            cartItem = new CartItem();
            cartItem.setUser_id(singleCartItem.getUser_id());
            cartItem.setProducts(new_item);
//            System.out.println("8472981842483798473274824837429874274");
            System.out.println(cartItem.getProducts().get(0).getName());
        }
        else{
            cartItem.setProducts(new_item);
        }
//        System.out.println(cartItem.getProducts().toString());
        cartRepository.save(cartItem);
        return "Item added to cart successfully";
    }
}
