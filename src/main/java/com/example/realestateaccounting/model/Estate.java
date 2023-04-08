package com.example.realestateaccounting.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank(message = "Необходимо выбрать округ")
    String county;

    @NotBlank(message = "Необходимо выбрать район")
    String district;

    @NotBlank(message = "Необходимо выбрать адрес")
    String address;

    @Temporal(TemporalType.TIMESTAMP)
    Date publishingDate;

    @NotBlank(message = "Необходимо выбрать тип объекта")
    String type;

    @NotBlank(message = "Необходимо выбрать состояние объекта")
    String state;

    @NotBlank(message = "Необходимо выбрать площадь объекта")
    double area;

    @NotBlank(message = "Необходимо выбрать собственника объекта")
    String owner;

    @NotBlank(message = "Необходимо выбрать фактического пользователя объекта")
    String actualUser;

    List<byte[]> photos;

    @OneToMany(mappedBy = "estate" ,fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    List<Work> works;
}
