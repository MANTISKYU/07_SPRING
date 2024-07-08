package com.ohgiraffers.section03.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
@PropertySource("section03/properties/product-info.properties")
public class ContextConfiguration {

    // 값을 못 찾아왔을 경우 콜론 뒤에 있는 값으로 찾아옴
    @Value("${bread.carpbread.name:팥붕어빵}")
    private String carpBreadName;

    @Value("${bread.carpbread.price:0}")
    private int carpBreadPrice;

    @Bean
    public Product carpBread() {
        return new Bread(carpBreadName, carpBreadPrice, LocalDate.now());
    }

    @Value("${beverage.milk.name:그냥우유")
    private String milkName;

    @Value("${beverage.milk.price:0}")
    private int milkPrice;

    @Value("${beverage.milk.capacity:0}")
    private int milkCapacity;

    @Bean
    public Product milk() {
        return new Beverage(milkName, milkPrice, milkCapacity);


    }

    @Bean
    public Product water(@Value("${beverage.water.name:0}") String waterName,
                         @Value("${beverage.water.price:0}") int waterPrice,
                         @Value("${beverage.water.capacity:0}") int waterCapacity) {

        return new Beverage(waterName, waterPrice, waterCapacity);

    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}
