package com.capstone.cartservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cart")
public class CartController {


    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping(path = "/getItems/{user_id}")
    public CartItem getCartItems(@PathVariable("user_id") Long user_id){
//        System.out.println("j243242424342434" + " ----" + user_id);
        return cartService.getCartItems(user_id);
    }

    @PostMapping(path="/addItem",produces = MediaType.APPLICATION_JSON_VALUE,  consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addProduct(@RequestBody SingleCartItem singleCartItem){
        return cartService.addCartItem(singleCartItem);
    }


}
