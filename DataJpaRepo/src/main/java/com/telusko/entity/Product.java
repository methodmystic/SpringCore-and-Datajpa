package com.telusko.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Product 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="StudentId")
	private int id;
	
    @Column(name="ProductName")
	private String name;
	
    @Column(name="Category")
	private String Category;
	
    @Column(name="Price")
    private Double price;
	
    @Column(name="Quantity")
    private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Category=" + Category + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String Category, double Price , int quantity) {
		super();
		this.name = name;
		this.Category = Category;
		this.price = price ; 
		this.quantity = quantity;
	}
    
    

}
