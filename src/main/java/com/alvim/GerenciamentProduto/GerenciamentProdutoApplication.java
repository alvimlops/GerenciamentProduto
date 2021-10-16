package com.alvim.GerenciamentProduto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alvim.GerenciamentProduto.entities.Category;
import com.alvim.GerenciamentProduto.entities.Product;
import com.alvim.GerenciamentProduto.repositories.CategoryRepository;
import com.alvim.GerenciamentProduto.repositories.ProductRepository;

@SpringBootApplication
public class GerenciamentProdutoApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GerenciamentProdutoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category (null, "eletromics");
		Category cat2 = new Category (null, "Books");
		
		Product p1 = new Product(null, "TV", 2200.00, cat1);
		Product p2 = new Product(null, "Domain", 120.00, cat2);
		Product p3 = new Product(null, "ps5", 2800.00, cat1);
		Product p4 = new Product(null, "Docker", 100.00, cat2);
		
		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
		
		
		ProductRepository.save(p1);
		ProductRepository.save(p2);
		ProductRepository.save(p3);
		ProductRepository.save(p4);
		
		
		
	}

}
