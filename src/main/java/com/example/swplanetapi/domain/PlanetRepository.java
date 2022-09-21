package com.example.swplanetapi.domain;

import org.springframework.data.repository.CrudRepository;

import com.example.swplanetapi.domain.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
