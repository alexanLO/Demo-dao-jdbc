package application;

import models.entities.Department;

public class Program {
    public static void main(String[] args) throws Exception {
       
        Department department = new Department(1, "Books");

        System.out.println(department);
    }
}
