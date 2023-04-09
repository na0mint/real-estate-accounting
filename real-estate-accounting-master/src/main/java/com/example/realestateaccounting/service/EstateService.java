package com.example.realestateaccounting.service;

import com.example.realestateaccounting.model.Estate;

import java.util.List;

public interface EstateService {
    Estate save(Estate estate);
    Estate delete(Estate estate);

    List<Estate> index();

}
