package com.example.demo.dao;

import com.example.demo.model.Employees;

import org.springframework.data.repository.CrudRepository;


public interface employeeDao extends CrudRepository<Employees, Integer>{

}
