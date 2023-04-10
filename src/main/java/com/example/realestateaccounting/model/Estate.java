package com.example.realestateaccounting.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String county;

    String district;

    String address;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd-MM-yyyy")
    Date publishingDate;

    String type;

    String state;

    double area;

    String owner;

    String actualUser;

    @OneToMany(cascade = CascadeType.ALL)
    List<Work> workList;
}
