package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    Map<CustomerType,DiscountPolicy> mapa = new HashMap<>();

    public double apply(double amount, CustomerType type){
        switch (type){
            case REGULAR: return amount * 0.95;
            case PREMIUM: return amount * 0.90;
            default: return amount;
        }
    }
}
