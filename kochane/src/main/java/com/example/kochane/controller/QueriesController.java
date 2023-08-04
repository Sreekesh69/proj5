package com.example.kochane.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kochane.model.Queries;
import com.example.kochane.service.QueriesService;

@RestController
@RequestMapping("/api")
public class QueriesController {
    
    @Autowired
    QueriesService queriesService;

    @GetMapping("/show_all")
    public List<Queries> getDetails(){
        return queriesService.getTableDatas();

    }
}
