package com.example.realestateaccounting.service.impl;

import com.example.realestateaccounting.model.Estate;
import com.example.realestateaccounting.repository.EstateRepository;
import com.example.realestateaccounting.service.EstateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EstateServiceImpl implements EstateService {
    private final EstateRepository estateRepository;

    @Override
    public Estate save(Estate estate) {
        log.info("Сохранен объект с идентификатором {} по адресу {}", estate.getId(), estate.getAddress());
        return estateRepository.save(estate);
    }

    @Override
    public Estate delete(Estate estate) {
        log.info("Удален объект с идентификатором {} по адресу {}", estate.getId(), estate.getAddress());
        estateRepository.delete(estate);
        return estate;
    }

    @Override
    public List<Estate> index() {
        return estateRepository.findAll();
    }

    @Override
    public Estate findById(int id) {
        return estateRepository.findById(id).orElse(new Estate());
    }
}
