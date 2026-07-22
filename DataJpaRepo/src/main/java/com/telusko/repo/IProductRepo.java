package com.telusko.repo;
import org.springframework.data.jpa.repository.JpaRepository;
.

import com.telusko.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer>
{
      
}
