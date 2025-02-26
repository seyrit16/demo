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
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name = "organization_id")
    private Integer organizationId;

    @NonNull
    @Column(name = "address_type_id")
    private Integer addressTypeId;

    @NonNull
    @Column(name = "subject_name")
    private String subjectName;

    @NonNull
    @Column(name = "city_name")
    private String cityName;

    @NonNull
    @Column(name = "street_name")
    private String streetName;

    @NonNull
    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "add_info")
    private String addInfo;
}
