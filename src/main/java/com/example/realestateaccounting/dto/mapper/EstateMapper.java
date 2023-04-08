package com.example.realestateaccounting.dto.mapper;

import com.example.realestateaccounting.dto.EstateDto;
import com.example.realestateaccounting.model.Estate;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstateMapper {
    EstateDto mapToEstateDto(Estate estate);
    Estate mapToEstate(EstateDto estateDto);

    List<EstateDto> maptoEstateDtoList(List<Estate> estateList);
    List<Estate> mapToEstateList(List<EstateDto> estateDtoList);
}
