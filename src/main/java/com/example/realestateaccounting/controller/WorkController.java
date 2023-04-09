package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.WorkDto;
import com.example.realestateaccounting.dto.mapper.WorkMapper;
import com.example.realestateaccounting.service.WorkService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.jdbc.Work;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkController {
    WorkService workService;
    WorkMapper workMapper;
 
    
    @GetMapping()
    public List<WorkDto> index(){
        return workMapper.maptoWorkDtoList(workService.index());
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public WorkDto addWork(@RequestBody WorkDto workDto){
        return workMapper.mapToWorkDto(workService.save(workMapper.mapToWork(workDto)));
    }

    @GetMapping("/{id}")
    public WorkDto showWork(@PathVariable int id){
        return workMapper.mapToWorkDto(workService.findByIndex(id));
    }
}
