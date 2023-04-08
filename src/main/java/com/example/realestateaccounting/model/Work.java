package com.example.realestateaccounting.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "estate_id", nullable = false)
    Estate estate;

    @NotBlank(message = "Необходимо задать формулировку работ")
    String statement;

    @Temporal(TemporalType.TIMESTAMP)
    Date publishingDate;

    @Temporal(TemporalType.TIMESTAMP)
    Date expirationDate;

    @NotBlank(message = "Необходимо выбрать отвественного")
    String responsible;

    boolean isDone;
}
