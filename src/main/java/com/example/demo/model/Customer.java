package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_surname")
    private String surname;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_patronymic")
    private String patronymic;

    @NonNull
    @Column(name = "customer_phone_number")
    private String phoneNumber;

    @Column(name = "add_info")
    private String addInfo;
}
