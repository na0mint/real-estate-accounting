package com.example.realestateaccounting.service;

import com.example.realestateaccounting.model.Estate;

public interface EstateService {
    Estate save(Estate estate);
    Estate delete(Estate estate);

}
