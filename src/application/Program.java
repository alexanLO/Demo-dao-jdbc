package application;

import java.util.List;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 01: Seller FindById ===");
        Seller seller = sellerDao.findById(3);      
        System.out.println(seller);

        System.out.println();

        System.out.println("=== Teste 02: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for(Seller obj: sellers){
            System.out.println(obj);
        }
    }
}
