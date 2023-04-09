package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.EstateDto;
import com.example.realestateaccounting.dto.WorkDto;
import com.example.realestateaccounting.dto.mapper.EstateMapper;
import com.example.realestateaccounting.dto.mapper.WorkMapper;
import com.example.realestateaccounting.service.EstateService;
import com.example.realestateaccounting.service.WorkService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkController {
    WorkService workService;
    EstateService estateService;
    WorkMapper workMapper;
    EstateMapper estateMapper;

    @GetMapping()
    public List<WorkDto> index() {
        return workMapper.mapToWorkDtoList(workService.index());
    }

    @PostMapping("/new/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public WorkDto addWork(@PathVariable int id, @RequestBody WorkDto workDto) {
        EstateDto estateDto = estateMapper.mapToEstateDto(estateService.findById(id));

        estateDto.getWorkList().add(workMapper.mapToWork(workDto));

        estateService.save(estateMapper.mapToEstate(estateDto));

        return workDto;
    }

    @GetMapping("/{id}")
    public WorkDto showWork(@PathVariable int id) {
        return workMapper.mapToWorkDto(workService.findById(id));
    }

    @PutMapping("/edit")
    public WorkDto editWork(@RequestBody WorkDto editedWorkDto){
        WorkDto workDto = workMapper.mapToWorkDto(workService.findById(editedWorkDto.getId()));

        workDto.setStatement(editedWorkDto.getStatement());
        workDto.setResponsible(editedWorkDto.getResponsible());
        workDto.setExpirationDate(editedWorkDto.getExpirationDate());
        workDto.setPublishingDate(editedWorkDto.getExpirationDate());

        workService.save(workMapper.mapToWork(workDto));

        return workDto;
    }
}

