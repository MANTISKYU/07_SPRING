package com.ohgiraffers.common;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Bread extends Product {

    private LocalDate bakedDate;


    public Bread(String name, int price, LocalDate bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }
}
