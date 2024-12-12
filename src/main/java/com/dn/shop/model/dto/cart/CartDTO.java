package com.dn.shop.model.dto;

import java.math.BigDecimal;
import java.util.List;

public class CartDTO {
    private Long id; // Unique identifier of the cart
    private Long userId; // The ID of the user owning the cart
    private List<CartItemDTO> cartItems; // A list of CartItemDTO objects
    private BigDecimal totalPrice; // The total price of the items in the cart

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<CartItemDTO> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDTO> cartItems) {
        this.cartItems = cartItems;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
} 