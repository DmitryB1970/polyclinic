package com.javaacademy.polyclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Polyclinic polyclinic = context.getBean(Polyclinic.class);
        polyclinic.dentistTreatCost();
        polyclinic.seniorSurgeonTreatCost();
        polyclinic.juniorSurgeonTreatCost();
        polyclinic.therapistTreatCost();

        Cashier cashier = context.getBean(Cashier.class);
        cashier.printProfit();
    }
}
