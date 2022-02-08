package application;

import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;
import models.entities.Seller;

public class Program02 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Teste 01: Department FindById ===");
        Department department = departmentDao.findById(3);      
        System.out.println(department);
        
        System.out.println();
        
    }
}
