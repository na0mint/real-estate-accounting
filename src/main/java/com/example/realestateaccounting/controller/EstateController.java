package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.EstateDto;
import com.example.realestateaccounting.dto.mapper.EstateMapper;
import com.example.realestateaccounting.service.EstateService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estate")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EstateController {
    EstateService estateService;
    EstateMapper estateMapper;

    @GetMapping()
    public List<EstateDto> index() {
        return estateMapper.maptoEstateDtoList(estateService.index());
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public EstateDto addEstate(@RequestBody EstateDto estateDto) {
        return estateMapper.mapToEstateDto(estateService.save(estateMapper.mapToEstate(estateDto)));
    }

    @GetMapping("/{id}")
    public EstateDto showEstate(@PathVariable int id) {
        return estateMapper.mapToEstateDto(estateService.findById(id));
    }

}
