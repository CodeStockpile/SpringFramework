/**
 * 
 */
package com.surjeet.java.basics;

/**
 * @author Surjeet
 *
 */

class cartItem{
	private String itemCode;
	private int quantity;
	
	public cartItem(String itemCode, int quantity) {
		this.itemCode = itemCode;
		this.quantity = quantity;
	}

	public String getItemCode() {
		return itemCode;
	}


	public int getQuantity() {
		return quantity;
	}

	
}

class ShoppingCart{
	private cartItem items[];
	private int size;
	private int itemscount;
	private static final int DEFAULT_SIZE = 10;
	
	public ShoppingCart() {
		initializeCart(DEFAULT_SIZE);
	}
	
	public ShoppingCart(int size) {
		initializeCart(size);
		this.size = size;
	}
	
	private void initializeCart(int size) {
		items = new cartItem[size];
	}
	
	
	public void addToCart(cartItem item) {
		if(itemscount <= 10) {
		items[itemscount++] = item;
		}
	}
	
	public void order() {
		for(int i = 0; i<itemscount; i++) {
			System.out.printf("%s %d \n", items[i].getItemCode(), items[i].getQuantity());
		}
	}
	
}


public class ShopStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addToCart(new cartItem("a", 22));
		cart.addToCart(new cartItem("b", 11));
		cart.order();
		
		

	}

}
