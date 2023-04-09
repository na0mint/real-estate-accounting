package com.example.realestateaccounting.dto;

import com.example.realestateaccounting.model.Estate;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkDto {
    int id;
    Estate estate;
    String statement;
    Date publishingDate;
    Date expirationDate;
    String responsible;
}
