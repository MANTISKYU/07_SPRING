package com.ohgiraffers.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
// 부모클래스의 toString도 포함해서 출력
@ToString(callSuper = true)
public class Beverage extends Product {

    private int capacity; // 용량

    public Beverage(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }
}
