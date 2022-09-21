package com.example.swplanetapi.domain;

import org.springframework.stereotype.Service;

import com.example.swplanetapi.domain.Planet;
import com.example.swplanetapi.domain.PlanetRepository;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository ) {
        this.planetRepository = planetRepository;
    }

    public Planet create(Planet planet) {
        return planetRepository.save(planet);
    }

}
