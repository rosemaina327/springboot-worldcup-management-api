package com.safaricom.worldcup.controller;


import com.safaricom.worldcup.entity.Nationality;
import com.safaricom.worldcup.service.NationalityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NationalityController {

    private final NationalityService nationalityService;

    public NationalityController(NationalityService nationalityService) {

        // "this.nationalityService" = the field in THIS class
        // "nationalityService" = the parameter Spring passed in

        this.nationalityService = nationalityService;
    }

    @GetMapping("/nationalities")//API request in one class

    public List<Nationality> getNationalities() {

        // Delegate to service - controller doesn't do business logic
        // It just receives request and hands it off

        return nationalityService.getAllNationalities();
    }
}
