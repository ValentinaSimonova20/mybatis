package com.example.mybatis.controllers;

import com.example.mybatis.api.DepartmentsService;
import com.example.mybatis.dto.DepartmentsDTO;
import com.example.mybatis.dto.LocationsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentsService departmentsService;

    @PostMapping("/list")
    public List<DepartmentsDTO> getListDepartments(){
        return departmentsService.getAllWithLocation();
    }
}
