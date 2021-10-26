package it.unibo.oop.lab05.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private Product[] product = new Product[0];
	
	@Override
	public void addProduct(Product p) {
		this.product = Arrays.copyOf(product, product.length + 1);
		this.product[product.length] = p;

	}

	@Override
	public Set<String> allNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
