package com.boii_projects.KartIn.service.cart;

import com.boii_projects.KartIn.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);


}
