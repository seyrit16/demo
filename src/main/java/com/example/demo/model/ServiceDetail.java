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
@Table(name = "service_detail")
public class ServiceDetail {
    @Id
    @Column(name = "service_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name = "type_id")
    private Integer typeId;

    @NonNull
    @Column(name = "service_detail_code")
    private String code;

    @NonNull
    @Column(name = "service_detail_name")
    private String name;

    @NonNull
    @Column(name = "service_detail_cost")
    private String cost;

    @NonNull
    @Column(name = "service_detail_duration")
    private String duration;

    @Column(name = "add_info")
    private String addInfo;
}
