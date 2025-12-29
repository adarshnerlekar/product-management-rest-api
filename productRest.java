package com.springrestdatabase2.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrestdatabase2.Exception.ErrorResponce;
import com.springrestdatabase2.entity.product;
import com.springrestdatabase2.entity.productPrice;
import com.springrestdatabase2.service.productService;

import jakarta.websocket.server.PathParam;

@RestController
public class productRest 
{
	@Autowired
	productService service;
	
	@DeleteMapping("Deleteproduct/{id}")
	public ResponseEntity<String> DeleteProduct( @PathVariable Integer id)
	{
		String msg = service.DeleteProduct(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	
	@PatchMapping("updateprice/{id}")
	public ResponseEntity<String> updatePrice(@PathVariable Integer id,@RequestBody productPrice price)
	{
		String updatePrice = service.UpdatePrice(id, price);
		return new ResponseEntity<String>(updatePrice, HttpStatus.OK);
	}
	
	
	@PutMapping("updateProduct/{id}")
	public ResponseEntity<String> Updateproduct(@PathVariable Integer id,@RequestBody product product)
	{
		String updateProduct = service.UpdateProduct(id, product);
		return new ResponseEntity<String>(updateProduct, HttpStatus.OK);
	}
	
	@GetMapping("profind")
	public  ResponseEntity<List<product>> findAllProduct()
	{
		List<product> Products = service.FindAllProduct();
		return new ResponseEntity<List<product>>(Products,HttpStatus.OK);
	}
	
	
	@GetMapping("proid")
	public ResponseEntity<product> FindBy1(@RequestParam Integer id )
	{
		product Id = service.productFindById(id);
		return new ResponseEntity<product>(Id, HttpStatus.ACCEPTED);
	}
	
	
	
	
	@GetMapping("proid/{id}")
	public ResponseEntity<product> FindBy(@PathVariable Integer id)
	{
		product Id = service.productFindById(id);
		return new ResponseEntity<product>(Id, HttpStatus.ACCEPTED);
	}
	
	
	
	
	@PostMapping("product")
	public ResponseEntity<String> saveProduct(@RequestBody product product)
	{
		 String msg=service.SaveProductdata(product);
		 return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
}
