package com.telusko.service;
import com.telusko.repo.IProductRepo;
import com.telusko.entity.Product;
import java.util.List;


public interface IProductService
{
	String SaveProduct(Product product);
	Iterable<Product>saveMultipleProducts(Iterable<Product> products);
	
	

}
