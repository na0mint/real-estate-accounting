package com.example.realestateaccounting.service.impl;

import com.example.realestateaccounting.model.Work;
import com.example.realestateaccounting.repository.WorkRepository;
import com.example.realestateaccounting.service.WorkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class WorkServiceImpl implements WorkService {

    private final WorkRepository workRepository;
    @Override
    public Work save(Work work) {
        log.info("Сохранена работа с идентфикатором {}, ответсвенный {}", work.getId(), work.getResponsible());

        return workRepository.save(work);
    }

    @Override
    public List<Work> findWorksByExpirationDate(Date expirationDate) {
        return (List<Work>) workRepository.findWorksByExpirationDate(expirationDate);
    }

    @Override
    public List<Work> findWorksByPublishingDate(Date publishingDate) {
        return (List<Work>) workRepository.findWorksByPublishingDate(publishingDate);
    }

    @Override
    public List<Work> findWorksByObjectType(String type) {
        return (List<Work>) workRepository.findWorksByObjectType(type);
    }

    @Override
    public List<Work> findWorksInProgress() {
        return (List<Work>) workRepository.findByIsDoneFalse();
    }

    public List<Work> index(){
        return workRepository.findAll();
    }

    public Work findByIndex(int id){
        return workRepository.findById(id).orElse(new Work());
    }
}
