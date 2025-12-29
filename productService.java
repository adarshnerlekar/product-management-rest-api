package com.springrestdatabase2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestdatabase2.entity.product;
import com.springrestdatabase2.entity.productPrice;

public interface productService {
	
	String SaveProductdata(product product);
	product productFindById(Integer id);
	List<product> FindAllProduct();
	String UpdateProduct(Integer id,product product);
	String UpdatePrice(Integer id,productPrice price);
	String DeleteProduct(Integer id);
}
