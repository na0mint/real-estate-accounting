package com.example.realestateaccounting.controller;

import com.example.realestateaccounting.dto.mapper.WorkMapper;
import com.example.realestateaccounting.service.WorkService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/work")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WorkController {
    WorkService workService;
    WorkMapper workMapper;
}
