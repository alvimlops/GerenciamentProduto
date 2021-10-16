package com.alvim.GerenciamentProduto.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.alvim.GerenciamentProduto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	Object findById(Long id);

	List<Category> findAll();

	void save(Category cat1);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
