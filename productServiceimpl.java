package com.springrestdatabase2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrestdatabase2.Repositry.productRepositry;
import com.springrestdatabase2.entity.product;
import com.springrestdatabase2.entity.productPrice;
import com.springrestdatabase2.service.productService;
@Service
public class productServiceimpl  implements productService


{
	@Autowired
	productRepositry repositry;
	
	@Override
	public String SaveProductdata(product  product) 
	{
		repositry.save(product);
		return "product Save Sessfully";
		
	}

	@Override
	public  product productFindById(Integer id) {
		Optional<product> byId = repositry.findById(id);
		if(byId.isPresent())
		{
			return repositry.getById(id);
		
		}
		throw new RuntimeException("product Id Not Found :"+id);
	}

	public List<product> FindAllProduct() {
		List<product> all = repositry.findAll();
		return all;
	}

	@Override
	public String UpdateProduct(Integer id, product product) {
	     Optional<product> byId = repositry.findById(id);
		if(byId.isPresent())
		{
			product updatePro = byId.get();
			updatePro.setName(product.getName());
			updatePro.setAvaliblity(product.getAvaliblity());
			updatePro.setBrand(product.getBrand());
			updatePro.setCatagory(product.getCatagory());
			updatePro.setPrice(product.getPrice());
			updatePro.setQty(product.getQty());
			repositry.save(updatePro);
			return "Product Update SucessFully";
		}
		throw new RuntimeException("product Id Not Found :"+id);
	}

	@Override
	public String UpdatePrice(Integer id, productPrice price) 
	{
		Optional<product> byId = repositry.findById(id);
		if(byId.isPresent())
		{
			product product = byId.get();
			product.setPrice(price.getPrice());
			repositry.save(product);
			return "Price Update SucessFully";
		}
		throw new RuntimeException("product Id Not Found :"+id); 
	}

	@Override
	public String DeleteProduct(Integer id) 
	{
		 boolean existsById = repositry.existsById(id);
		if(existsById==true)
		{
			repositry.deleteById(id);
			return "Product Delete Suessfully";
		}
		
		throw new RuntimeException("product Id Not Found :"+id); 
		
		
		
	}

	

	

	
}
