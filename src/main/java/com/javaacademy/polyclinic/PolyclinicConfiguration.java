package com.javaacademy.polyclinic;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = DoctorProperty.class)
public class PolyclinicConfiguration {

    private DoctorProperty doctorProperty;

    public PolyclinicConfiguration(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(DoctorSpecialization.DENTIST, doctorProperty.getDentistFee());
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(DoctorSpecialization.THERAPIST, doctorProperty.getTherapistFee());
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(DoctorSpecialization.SURGEON, doctorProperty.getJuniorSurgeonFee());
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(DoctorSpecialization.SURGEON, doctorProperty.getSeniorSurgeonFee());
    }
}
