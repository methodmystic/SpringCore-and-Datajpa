package com.telusko.repo;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends PagingAndSortingRepository<Product, Integer>
{

}
