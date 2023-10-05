package com.example.demo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="ProdTableapana")

@Getter
@Setter
public class Product {
	@Id
	@Column(length = 10)
	private Integer id;
	@Column(length = 20)
	private String prodName;
	@Column(length = 10)
	private Double prodPrice;

	/*
	 * public Integer getId() { return id; } public void setId(Integer id) { this.id
	 * = id; } public String getProdName() { return prodName; } public void
	 * setProdName(String prodName) { this.prodName = prodName; } public Double
	 * getProdPrice() { return prodPrice; } public void setProdPrice(Double
	 * prodPrice) { this.prodPrice = prodPrice; }
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	

}
