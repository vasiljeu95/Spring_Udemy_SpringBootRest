package com.github.vasiljeu95.spring_udemy_springbootrest.dao;

import com.github.vasiljeu95.spring_udemy_springbootrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
