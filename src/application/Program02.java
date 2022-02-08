package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;

public class Program02 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Teste 01: Department FindById ===");
        Department department = departmentDao.findById(3);      
        System.out.println(department);
        
        System.out.println();

        System.out.println("=== Teste 02: Department FindAll ===");
        List<Department> departments = departmentDao.findAll();     
        for (Department department2 : departments) {
            System.out.println(department2);
        }
        
        System.out.println();

        department = new Department(null, "Roupas de Banho");
        departmentDao.insert(department);
        System.out.println("Foi inserido um novo ID: " + department.getId());

        System.out.println();
        
    }
}
