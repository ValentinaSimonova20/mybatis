package com.example.mybatis.service;

import com.example.mybatis.api.LocationsService;
import com.example.mybatis.dao.LocationsMapper;
import com.example.mybatis.dto.LocationsDTO;
import com.example.mybatis.entity.LocationsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationsServiceImpl implements LocationsService {

    @Autowired
    private LocationsMapper locationsMapper;


    @Override
    @Transactional
    public LocationsDTO save(LocationsDTO locationsDTO) {

        ModelMapper modelMapper = new ModelMapper();

        LocationsEntity locationsEntity = modelMapper.map(locationsDTO, LocationsEntity.class);

        locationsMapper.save(locationsEntity);

        return modelMapper.map(locationsEntity, LocationsDTO.class);

    }

    @Override
    public List<LocationsDTO> getListLocations() {
        ModelMapper modelMapper = new ModelMapper();

        return locationsMapper.getListLocations().stream()
                .map(locationsEntity -> modelMapper.map(locationsEntity, LocationsDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public LocationsDTO getLocationById(Long id) {
        ModelMapper modelMapper = new ModelMapper();

        return  modelMapper.map(locationsMapper.getLocationById(id),LocationsDTO.class);
    }
}
