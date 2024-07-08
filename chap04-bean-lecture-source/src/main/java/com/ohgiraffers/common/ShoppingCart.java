package com.ohgiraffers.common;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ShoppingCart {

    private final List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItem() {
        return items;
    }
}
