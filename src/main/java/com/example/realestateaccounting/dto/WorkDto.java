package com.example.realestateaccounting.dto;

import com.example.realestateaccounting.model.Estate;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WorkDto {
    int id;
    String statement;
    @JsonFormat(pattern="dd-MM-yyyy")
    Date publishingDate;
    @JsonFormat(pattern="dd-MM-yyyy")
    Date expirationDate;
    String responsible;
}
