package com.ecomerce.product;

public class ShoppingCartItem {
	private int shoppingCartItemId;
	private Product productQuantity;
	
	public ShoppingCartItem() {
		
	}
	
	public ShoppingCartItem(int shoppingCartItemId, Product productQuantity) {
		this.shoppingCartItemId = shoppingCartItemId;
		this.productQuantity = productQuantity;
	}

	public int getShoppingCartItemId() {
		return shoppingCartItemId;
	}

	public void setShoppingCartItemId(int shoppingCartItemId) {
		this.shoppingCartItemId = shoppingCartItemId;
	}

	public Product getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Product productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	

}
