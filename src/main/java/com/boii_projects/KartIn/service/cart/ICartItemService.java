package com.boii_projects.KartIn.service.cart;

import com.boii_projects.KartIn.model.CartItem;

import java.util.List;

public interface ICartItemService {
    void addItemToCart(Long cartId, Long productId, int quantity);
    void removeIteamFormCart(Long cartId, Long productId);
    void updateItemQuantity(Long cartId, Long productId, int quantity);
}
