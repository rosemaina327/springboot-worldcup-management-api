package com.safaricom.worldcup.service;


import com.safaricom.worldcup.dto.AddWorldCupCountryRequest;
import com.safaricom.worldcup.entity.WorldCup;
import com.safaricom.worldcup.repository.WorldCupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldCupService {

    private final WorldCupRepository worldCupRepository;

    public WorldCupService(WorldCupRepository worldCupRepository) {
        this.worldCupRepository = worldCupRepository;
    }

    public void addCountryToWorldCup(AddWorldCupCountryRequest request) {

        WorldCup worldCup = new WorldCup();

        worldCup.setCountryId(request.getCountryId());

        worldCupRepository.save(worldCup);//
    }
    public List<WorldCup> getAllWorldCupCountries() {

        return worldCupRepository.findAll();
    }






}
