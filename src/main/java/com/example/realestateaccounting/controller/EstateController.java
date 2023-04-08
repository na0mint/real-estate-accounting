package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.EstateDto;
import com.example.realestateaccounting.dto.mapper.EstateMapper;
import com.example.realestateaccounting.model.Estate;
import com.example.realestateaccounting.model.Work;
import com.example.realestateaccounting.service.EstateService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.mapstruct.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estate")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EstateController {
    EstateService estateService;
    EstateMapper estateMapper;


    @GetMapping("/estate-index")
    public String getEstateIndex(@RequestParam("workList") List<Work> workList){
        return "templates/estateIndex";
    }

    @GetMapping("/estate-list")
    public String getEstateList(@RequestParam("estate") Estate estate){
        return "templates/estate";
    }


}
