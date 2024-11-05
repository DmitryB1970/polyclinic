package com.javaacademy.polyclinic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Polyclinic {

    private Cashier cashier;
    private Doctor dentist;
    private Doctor therapist;
    private Doctor seniorSurgeon;
    private Doctor juniorSurgeon;

    public Polyclinic(Cashier cashier, @Qualifier("dentist") Doctor dentist, @Qualifier("therapist") Doctor therapist,
                      @Qualifier("seniorSurgeon") Doctor seniorSurgeon,
                      @Qualifier("juniorSurgeon") Doctor juniorSurgeon) {
        this.cashier = cashier;
        this.dentist = dentist;
        this.therapist = therapist;
        this.seniorSurgeon = seniorSurgeon;
        this.juniorSurgeon = juniorSurgeon;
    }

    public void dentistTreatCost() {
        cashier.addPayment(dentist.canTreatment());
    }

    public void therapistTreatCost() {
        cashier.addPayment(therapist.canTreatment());
    }

    public void seniorSurgeonTreatCost() {
        cashier.addPayment(seniorSurgeon.canTreatment());
    }

    public void juniorSurgeonTreatCost() {
        cashier.addPayment(juniorSurgeon.canTreatment());
    }
}
