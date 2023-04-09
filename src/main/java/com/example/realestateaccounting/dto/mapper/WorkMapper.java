package com.example.realestateaccounting.dto.mapper;

import com.example.realestateaccounting.dto.WorkDto;
import com.example.realestateaccounting.model.Work;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WorkMapper {
    WorkDto mapToWorkDto(Work work);
    Work mapToWork(WorkDto workDto);

    List<WorkDto> mapToWorkDtoList(List<Work> workList);
    List<Work> mapToWorkList(List<WorkDto> workDtoList);
}
