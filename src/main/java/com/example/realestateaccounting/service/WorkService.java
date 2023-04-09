package com.example.realestateaccounting.service;

import com.example.realestateaccounting.model.Work;

import java.sql.Date;
import java.util.List;

public interface WorkService {
    Work save(Work work);
    List<Work> findWorksByExpirationDate(Date expirationDate);
    List<Work> findWorksByPublishingDate(Date publishingDate);
    List<Work> findWorksByObjectType(String type);
    List<Work> findWorksInProgress();
    List<Work> index();
    Work findByIndex(int id);
}
