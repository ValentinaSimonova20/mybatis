package com.example.mybatis.service;

import com.example.mybatis.api.DepartmentsService;
import com.example.mybatis.dao.DepartmentsMapper;
import com.example.mybatis.dto.DepartmentsDTO;
import com.example.mybatis.dto.LocationsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

    @Autowired
    private DepartmentsMapper departmentsMapper;

    @Override
    public List<DepartmentsDTO> getAllWithLocation() {
        ModelMapper modelMapper = new ModelMapper();

        return departmentsMapper.getAllWithLocation().stream().map(departmentsEntity -> modelMapper
                .map(departmentsEntity, DepartmentsDTO.class)).
                collect(Collectors.toList());
    }
}
