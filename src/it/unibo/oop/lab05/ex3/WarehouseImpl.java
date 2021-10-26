package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private LinkedHashSet<Product> products;
	
	@Override
	public void addProduct(final Product p) {
		if (!this.containsProduct(p)) {
			this.products.add(p);
		}
	}

	@Override
	public Set<String> allNames() {
		final Set<String> productNames = null;
		for (Product p : products) {
			productNames.add(p.getName());
		}
		return productNames;
	}

	@Override
	public Set<Product> allProducts() {
		return this.products;
	}

	@Override
	public boolean containsProduct(final Product p) {
		for (final Product p2 : products) {
			if (p2.getName() == p.getName()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double getQuantity(String name) {
		for (final Product p2 : products) {
			if (p2.getName() == name) {
				return p2.getQuantity();
			}
		}
		return -1;
	}

}
