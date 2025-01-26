package com.clone.amazon.cartItem;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem,Integer> {



    List<CartItem> findByCartId(Integer cartId);
}
