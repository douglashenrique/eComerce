package com.ecomerce.product;

public class Product {
	private int productId;
	private String productName;
	private String productDescription;
	private String productPicture;
	private String productManufacturer;
	private int productSize;
	private String productColor;
	private int productUnitPrice;
	private int EPARegNumber;
	
	public Product() {
	}
	
	public Product(int productId, String productName,
			String productDescription, String productPicture,
			String productManufacturer, int productSize, String productColor,
			int productUnitPrice, int ePARegNumber) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPicture = productPicture;
		this.productManufacturer = productManufacturer;
		this.productSize = productSize;
		this.productColor = productColor;
		this.productUnitPrice = productUnitPrice;
		EPARegNumber = ePARegNumber;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductPicture() {
		return productPicture;
	}

	public void setProductPicture(String productPicture) {
		this.productPicture = productPicture;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getProductSize() {
		return productSize;
	}

	public void setProductSize(int productSize) {
		this.productSize = productSize;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public int getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(int productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public int getEPARegNumber() {
		return EPARegNumber;
	}

	public void setEPARegNumber(int ePARegNumber) {
		EPARegNumber = ePARegNumber;
	}
	
	

}
