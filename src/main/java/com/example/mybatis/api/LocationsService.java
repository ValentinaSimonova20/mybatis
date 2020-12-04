package com.example.mybatis.api;

import com.example.mybatis.dto.LocationsDTO;

import java.util.List;

public interface LocationsService {

    LocationsDTO save(LocationsDTO locationsDTO);

    List<LocationsDTO> getListLocations();

    LocationsDTO getLocationById(Long id);
}
