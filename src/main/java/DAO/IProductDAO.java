package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Product;

public interface IProductDAO extends JpaRepository<Product, Long> {
	Product findByName(String name);
	//void save(new Product);
}
