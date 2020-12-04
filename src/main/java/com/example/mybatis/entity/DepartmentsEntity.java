package com.example.mybatis.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentsEntity {
    
    private Integer departmentId;
    private String departmentName;
    private Integer managerId;
    private LocationsEntity location;
}
