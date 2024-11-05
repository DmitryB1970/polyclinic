package com.javaacademy.polyclinic;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

@ConfigurationProperties(prefix = "doctor")
@Data
public class DoctorProperty {

    private BigDecimal dentistFee;
    private BigDecimal therapistFee;
    private BigDecimal juniorSurgeonFee;
    private BigDecimal seniorSurgeonFee;
}
