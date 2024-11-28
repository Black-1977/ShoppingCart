package ru.skypro.shoppingcart.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope

public class ShoppingCart {
    private final Set<Integer> goods = new HashSet<Integer>();

    public void add(List<Integer> goods) {
        this.goods.addAll(goods);
    }

    public Set<Integer> get() {
        return Collections.unmodifiableSet(goods);
    }
}
