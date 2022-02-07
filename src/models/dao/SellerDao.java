package models.dao;

import java.util.List;

import models.entities.Seller;

public interface SellerDao {
    
    void insert(Seller seller);
    void update(Seller seller);
    void deleteByld(Integer id);
    Seller fingByld(Integer id);
    List<Seller> findAll();
}
