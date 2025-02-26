package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "connection_request")
public class ConnectionRequest {
    @Id
    @Column(name = "connection_request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NonNull
    @Column(name = "organiztion_id")
    Integer organizationId;

    @NonNull
    @Column(name = "reg_number")
    String registrationNumber;

    @NonNull
    @Column(name = "date_begin")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd.mm.yyyy")
    LocalDate dateBegin;

    @Column(name = "date_end")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd.mm.yyyy")
    LocalDate dateEnd;

    @NonNull
    @Column(name = "status")
    String status;

    @Column(name = "add_info")
    String addInfo;
}
