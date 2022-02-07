package application;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 01: o FindById ===");
        Seller seller = sellerDao.findById(3);      

        System.out.println(seller);
    }
}
