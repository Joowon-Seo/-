package com.zerobase.convpay.config;

import com.zerobase.convpay.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
public class ApplicationConfig {

    @Bean // 이것은 클래스가 아니라 ConveniencePayService 라는 타입으로 conveniencePayService라는 이름으로 빈을 등록해준 설정 값이다
    // 따라서 빈 이름을을 다른 것으로 바꾸면 text부분에서 빈 이름을 찾을 수 없다고 뜨게 된다.
    public ConveniencePayService conveniencePayService(){
        return new ConveniencePayService(
                new HashSet<>(
                        Arrays.asList(moneyAdapter(), cardAdapter())
                ),
                getDiscountByConvenience()
        );
    }

    @Bean
    public CardAdapter cardAdapter() {
        return new CardAdapter();
    }

    @Bean
    public MoneyAdapter moneyAdapter() {
        return new MoneyAdapter();
    }

    @Bean
    public DiscountByConvenience getDiscountByConvenience() {
        return new DiscountByConvenience();
    }
}
