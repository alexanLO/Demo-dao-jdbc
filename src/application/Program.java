package application;

import java.util.Date;

import models.entities.Department;
import models.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
       
        Department department = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);

        System.out.println(seller);
    }
}
