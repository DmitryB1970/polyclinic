package com.javaacademy.polyclinic;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

@Slf4j
public class Doctor {

    private DoctorSpecialization doctorSpecialization;
    private BigDecimal fee;

    public Doctor(DoctorSpecialization doctorSpecialization, BigDecimal fee) {
        this.doctorSpecialization = doctorSpecialization;
        this.fee = fee;
    }

    public BigDecimal canTreatment() {
        log.info("{} вылечил человека", doctorSpecialization);
        return fee;
    }
}
