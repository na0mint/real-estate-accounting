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

    //@NotBlank(message = "Необходимо выбрать округ")
    String county;

    //@NotBlank(message = "Необходимо выбрать район")
    String district;

    //@NotBlank(message = "Необходимо выбрать адрес")
    String address;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd-MM-yyyy")
    Date publishingDate;

    //@NotBlank(message = "Необходимо выбрать тип объекта")
    String type;

    //@NotBlank(message = "Необходимо выбрать состояние объекта")
    String state;

    //@NotBlank(message = "Необходимо выбрать площадь объекта")
    double area;

    //@NotBlank(message = "Необходимо выбрать собственника объекта")
    String owner;

    //@NotBlank(message = "Необходимо выбрать фактического пользователя объекта")
    String actualUser;

    //List<Byte[]> photos;

    @OneToMany(cascade = CascadeType.ALL)
    List<Work> workList;
}
