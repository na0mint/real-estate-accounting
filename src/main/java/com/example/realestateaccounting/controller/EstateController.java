package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.mapper.EstateMapper;
import com.example.realestateaccounting.service.EstateService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estate")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EstateController {
    EstateService estateService;
    EstateMapper estateMapper;

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("estates", estateMapper.maptoEstateDtoList(estateService.index()));
        return "estateIndex";
    }

}
