package br.com.mariojp.solid.ocp;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {
    Map<CustomerType, DiscountPolicy> map;

    public DiscountCalculator(Map<CustomerType, DiscountPolicy> map) {
        this.map = map;
    }

    public DiscountCalculator() {
        this.map = new HashMap<>();
        map.put(CustomerType.PARTNER, new PartnerPolicy());
        map.put(CustomerType.REGULAR, new RegularPolicy());
        map.put(CustomerType.PREMIUM, new PremiumPolicy());
    }

    public double apply(double amount, CustomerType type) {
        return map.get(type).apply(amount);
    }

    public void setMap(Map<CustomerType, DiscountPolicy> map) {
        this.map = map;
    }
}
