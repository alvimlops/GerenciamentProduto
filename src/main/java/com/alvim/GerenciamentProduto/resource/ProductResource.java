package com.alvim.GerenciamentProduto.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvim.GerenciamentProduto.entities.Product;
import com.alvim.GerenciamentProduto.repositories.ProductRepository;


@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductRepository categoyRepository;
	
	
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List <Product> list = categoyRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = categoyRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
