package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "service_request")
public class ServiceRequest {
    @Id
    @Column(name ="service_request_id")
    private Integer id;

    @NonNull
    @Column(name = "customer_id")
    private Integer customerId;

    @NonNull
    @Column(name = "organization_id")
    private Integer organizationId;

    @NonNull
    @Column(name = "data_service")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME, pattern = "dd.mm.yyyy hh:mm")
    private LocalDateTime dataService;

    @Column(name = "add_info")
    private String addInfo;
}
