package ru.skypro.shoppingcart.service;

import org.springframework.stereotype.Service;
import ru.skypro.shoppingcart.model.ShoppingCart;

import java.util.List;
import java.util.Set;

@Service

public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public void add(List<Integer> goods) {
        this.shoppingCart.add(goods);
    }

    @Override
    public Set<Integer> get() {
        return shoppingCart.get();
    }
}
