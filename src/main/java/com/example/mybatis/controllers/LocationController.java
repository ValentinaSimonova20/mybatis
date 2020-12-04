package com.example.mybatis.controllers;

import com.example.mybatis.api.LocationsService;
import com.example.mybatis.dto.LocationsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LocationController {

    @Autowired
    private LocationsService locationsService;

    @PostMapping("/save")
    public LocationsDTO saveLocation(@RequestBody @Validated LocationsDTO locationsDTO){
        return locationsService.save(locationsDTO);
    }

    @PostMapping("/list")
    public List<LocationsDTO> getListLocations(){
        return locationsService.getListLocations();
    }

    @PostMapping("/list/{id}")
    public LocationsDTO getLocationById(@PathVariable String id){
        return locationsService.getLocationById(Long.valueOf(id));
    }



}
