package ru.skypro.shoppingcart.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface ShoppingCartService {
    public void add(List<Integer> goods);
    public Set<Integer> get();
}
