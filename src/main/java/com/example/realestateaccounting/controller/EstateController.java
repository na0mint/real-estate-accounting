package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.EstateDto;
import com.example.realestateaccounting.dto.WorkDto;
import com.example.realestateaccounting.dto.mapper.EstateMapper;
import com.example.realestateaccounting.dto.mapper.WorkMapper;
import com.example.realestateaccounting.service.EstateService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estate")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EstateController {
    EstateService estateService;
    EstateMapper estateMapper;
    WorkMapper workMapper;

    @GetMapping()
    public List<EstateDto> index() {
        return estateMapper.mapToEstateDtoList(estateService.index());
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

    @PutMapping("/edit")
    public EstateDto editEstate(@RequestBody EstateDto editedEstateDto) {
        EstateDto estateDto = estateMapper.mapToEstateDto(estateService.findById(editedEstateDto.getId()));

        estateDto.setArea(editedEstateDto.getArea());
        estateDto.setAddress(editedEstateDto.getAddress());
        estateDto.setCounty(editedEstateDto.getCounty());
        estateDto.setDistrict(editedEstateDto.getDistrict());
        estateDto.setOwner(editedEstateDto.getOwner());
        estateDto.setType(editedEstateDto.getType());
        estateDto.setWorkList(editedEstateDto.getWorkList());
        estateDto.setActualUser(editedEstateDto.getActualUser());

        estateService.save(estateMapper.mapToEstate(estateDto));

        return estateDto;
    }

    @GetMapping("/{id}/works")
    public List<WorkDto> showWorkListBuId(@PathVariable int id) {
        return workMapper.mapToWorkDtoList((estateService.findById(id)).getWorkList());
    }

}
