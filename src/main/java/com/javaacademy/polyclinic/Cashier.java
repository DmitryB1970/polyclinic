package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class Cashier {

    private BigDecimal profit = BigDecimal.ZERO;

    public void addPayment(BigDecimal fee) {
        profit = profit.add(fee);
    }

    public void printProfit() {
        log.info("Доход: {}", profit);
    }
}
