package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert (Seller object);
    void update (Seller object);
    void deleteById (Integer id);
    Seller findById (Integer id);
    List<Seller> findAll();
}
