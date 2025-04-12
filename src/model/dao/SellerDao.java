package model.dao;

import java.util.List;

import model.entites.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deletedById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
