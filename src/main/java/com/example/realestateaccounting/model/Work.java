package com.example.realestateaccounting.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String statement;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd-MM-yyyy")
    Date publishingDate;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd-MM-yyyy")
    Date expirationDate;

    String responsible;

    boolean isDone;
}
