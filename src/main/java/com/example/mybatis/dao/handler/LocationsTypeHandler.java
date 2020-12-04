package com.example.mybatis.dao.handler;

import com.example.mybatis.entity.LocationsEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationsTypeHandler extends EntityTypeHandler<LocationsEntity>{
    @Override
    public LocationsEntity createEntity(ResultSet resultSet) throws SQLException {
        return new LocationsEntity(
                resultSet.getLong("location_id"),
                resultSet.getString("street_address"),
                resultSet.getString("city")
        );
    }
}
