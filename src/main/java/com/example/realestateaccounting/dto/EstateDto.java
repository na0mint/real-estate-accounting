package com.example.realestateaccounting.dto;

import com.example.realestateaccounting.model.Work;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EstateDto {
    int id;
    String county;
    String district;
    String address;
    Date publishingDate;
    String type;
    String state;
    double area;
    String owner;
    String actualUser;
    List<byte[]> photos;
    List<Work> works;
}
