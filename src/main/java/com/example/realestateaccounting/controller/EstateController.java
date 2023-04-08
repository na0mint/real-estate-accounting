package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.mapper.EstateMapper;
import com.example.realestateaccounting.service.EstateService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estate")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EstateController {
    EstateService estateService;
    EstateMapper estateMapper;

}
