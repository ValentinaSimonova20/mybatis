package com.example.mybatis.api;

import com.example.mybatis.dao.handler.LocationsTypeHandler;
import com.example.mybatis.dto.DepartmentsDTO;
import com.example.mybatis.entity.LocationsEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DepartmentsService {


    List<DepartmentsDTO> getAllWithLocation();
}
