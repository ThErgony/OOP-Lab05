package it.unibo.oop.lab05.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private Product[] product = new Product[0];
	
	@Override
	public void addProduct(final Product p) {
		if (!this.containsProduct(p)) {
			this.product = Arrays.copyOf(product, product.length + 1);
			this.product[product.length] = p;
		}
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
	public boolean containsProduct(final Product p) {
		for (final Product p2 : product) {
			if (p2.getName() == p.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double getQuantity(String name) {
		for (final Product p2 : product) {
			if (p2.getName() == name) {
				return p2.getQuantity();
			}
		}
		return -1;
	}

}
