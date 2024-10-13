package com.boii_projects.KartIn.service.cart;


import com.boii_projects.KartIn.repository.CartItemRepository;
import com.boii_projects.KartIn.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartItemService implements  ICartItemService{
    private final CartItemRepository cartItemRepository;
    private final IProductService productService;

    @Override
    public void addItemToCart(Long cartId, Long productId, int quantity) {
        // 1. Get the Cart
        // 2. get the products
        // 3. check if the product already in the cart
        // 4. If yes, then increase the quantity with the requested quantity
        // 5. if no , then initiate a new cartItem entry
    }

    @Override
    public void removeIteamFormCart(Long cartId, Long productId) {

    }

    @Override
    public void updateItemQuantity(Long cartId, Long productId, int quantity) {

    }
}
