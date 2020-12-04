package com.example.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationsEntity {
    private Long locationId;

    private String streetAddress;

    private String city;
}
