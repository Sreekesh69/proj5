package com.example.kochane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kochane.Repository.QueriesRepository;
import com.example.kochane.model.Queries;

@Service 

public class QueriesService {
    
    @Autowired
    QueriesRepository queriesRepository;

    public List<Queries> getTableDatas(){
        return queriesRepository.findAllData();

    }
}
