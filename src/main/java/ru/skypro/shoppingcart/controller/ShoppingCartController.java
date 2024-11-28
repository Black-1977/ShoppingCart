package ru.skypro.shoppingcart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.shoppingcart.service.ShoppingCartService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("add")
    public String add(@RequestParam List<Integer> goods){
        shoppingCartService.add(goods);
        return "Добавлено";
    }

    @GetMapping("get")
    public Set<Integer> get(){
        return shoppingCartService.get();
    }
}
