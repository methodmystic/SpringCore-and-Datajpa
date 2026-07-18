package com.telusko.service;
import com.telusko.entity.Product;
import com.telusko.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService implements IProductService
{

	@Autowired
	private IProductRepo repo;
	
	@Override
	public String SaveProduct(Product product) {
		Product pd = repo.save(product);
		return "Product Saved with Id : "+pd.getId();
	}

	@Override
	public Iterable<Product> saveMultipleProducts(Iterable<Product> products) {
		
		return repo.saveAll(products);
	}

}
