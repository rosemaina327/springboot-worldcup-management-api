package com.safaricom.worldcup.service;

import com.safaricom.worldcup.entity.Nationality;
import com.safaricom.worldcup.repository.NationalityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NationalityService { //add service class in one class

    private final NationalityRepository nationalityRepository;

    public NationalityService(NationalityRepository nationalityRepository) {

        this.nationalityRepository = nationalityRepository;
    }

    public List<Nationality> getAllNationalities() {

        return nationalityRepository.findAll();
    }
}
