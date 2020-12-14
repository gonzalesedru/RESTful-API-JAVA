package com.example.demo.controller;

import com.example.demo.dao.employeeDao;
import com.example.demo.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")

public class EmployeeController {
    @Autowired
    private employeeDao dao;

    @PostMapping("/postItem")
    public String postItem(@RequestBody List<Employees> item) {
        dao.saveAll(item);
        return "ticket booked : " + item.size();
    }

    @GetMapping("/getItem")
    public List<Employees> getItems() {
        return (List<Employees>) dao.findAll();
    }

    @PutMapping("/updateItems")
    public String updateItem(@RequestBody List<Employees> item) {
        dao.saveAll(item);
        return "ticket updated : " + item.size();
    }
    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id) {
        dao.deleteById(id);
        return "Item Deleted";
    }
}
