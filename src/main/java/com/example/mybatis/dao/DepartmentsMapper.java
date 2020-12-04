package com.example.mybatis.dao;

import com.example.mybatis.dao.handler.LocationsTypeHandler;
import com.example.mybatis.dto.DepartmentsDTO;
import com.example.mybatis.entity.DepartmentsEntity;
import com.example.mybatis.entity.LocationsEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentsMapper {


    @Results(value = {
            @Result(property = "location",
                    column = "location_id",
                    javaType = LocationsEntity.class,
                    one = @One, typeHandler = LocationsTypeHandler.class)
    })
    @Select("select * from departments d left join locations l on d.location_id = l.location_id")
    List<DepartmentsEntity> getAllWithLocation();
}
