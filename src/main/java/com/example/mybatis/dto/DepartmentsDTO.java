package com.example.mybatis.dto;

import com.example.mybatis.entity.LocationsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentsDTO {
    private Integer departmentId;
    private String departmentName;
    private Integer managerId;
    private LocationsEntity location;
}
