package com.ecomerce.product;

public class Catalog {
	
	private int catalogId;
	private String catalogName;
	private String catalogManufacturer;
	
	public Catalog() {
		
	}
	
	
	public Catalog(int catalogId, String catalogName, String catalogManufacturer) {
		this.catalogId = catalogId;
		this.catalogName = catalogName;
		this.catalogManufacturer = catalogManufacturer;
	}


	public int getCatalogId() {
		return catalogId;
	}


	public void setCatalogId(int catalogId) {
		this.catalogId = catalogId;
	}


	public String getCatalogName() {
		return catalogName;
	}


	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}


	public String getCatalogManufacturer() {
		return catalogManufacturer;
	}


	public void setCatalogManufacturer(String catalogManufacturer) {
		this.catalogManufacturer = catalogManufacturer;
	}
	
	

}
