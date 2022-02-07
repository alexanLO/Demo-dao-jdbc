package models.dao;

import java.util.List;

import models.entities.Department;

public interface DepartmentDao {
    
    void insert(Department department);
    void update(Department department);
    void deleteByld(Integer id);
    Department fingByld(Integer id);
    List<Department> findAll();
}
