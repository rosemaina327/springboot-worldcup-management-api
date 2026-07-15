package com.safaricom.worldcup.controller;

import com.safaricom.worldcup.dto.AddWorldCupCountryRequest;
import com.safaricom.worldcup.entity.WorldCup;
import com.safaricom.worldcup.service.WorldCupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/world-cup")
public class WorldCupController {

    private final WorldCupService worldCupService;

    public WorldCupController(WorldCupService worldCupService) {

        this.worldCupService = worldCupService;
    }
    @PostMapping
    public String addCountryToWorldCup(
            @RequestBody AddWorldCupCountryRequest request) {//client is sending
        //JSON in the request body.Convert it to a Java object for me.

        worldCupService.addCountryToWorldCup(request);//delegate to the service layer
        //to do the logic

        return "Country added successfully";
    }
    @GetMapping
    public List<WorldCup> getAllWorldCupCountries() {

        // Ask the service for all countries
        // The service asks the repository
        // The repository asks Hibernate
        // Hibernate asks MySQL
        // Then the data flows back up: MySQL → Hibernate → Repository → Service → Controller → Client

        return worldCupService.getAllWorldCupCountries();
    }

}
