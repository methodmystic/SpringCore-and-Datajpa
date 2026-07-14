package com.telusko.repo;
import org.springframework.data.repository.CrudRepository;
import com.telusko.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product, Integer>
{

}
