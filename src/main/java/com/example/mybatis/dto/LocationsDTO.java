package com.example.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationsDTO {
    private Long locationId;

    private String streetAddress;

    private String city;

}
