package com.example.mybatis.dao;

import com.example.mybatis.entity.LocationsEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LocationsMapper {

    @Insert("insert into locations (location_id, street_address, city) "+
            "values (#{locationId}, #{streetAddress}, #{city})")
    void save(LocationsEntity locationsEntity);

    @Select("select * from locations")
    List<LocationsEntity> getListLocations();

    @Select("select * from locations where location_id=#{id}")
    LocationsEntity getLocationById(Long id);
}
