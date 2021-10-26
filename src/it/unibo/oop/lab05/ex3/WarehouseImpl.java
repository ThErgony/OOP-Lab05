package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private Set<Product> products = new LinkedHashSet<>();
	
	@Override
	public void addProduct(final Product p) {
		if (!this.containsProduct(p)) {
			this.products.add(p);
			System.out.println("Product " + p.getName() + " add to warehouse");
		} else {
			System.out.println("Product " + p.getName() + " already present, impossible add more.");
		}
	}

	@Override
	public Set<String> allNames() {
		final Set<String> productNames = new LinkedHashSet<>();
		for (final Product p : this.products) {
			productNames.add(p.getName());
		}
		return productNames;
	}

	@Override
	public Set<Product> allProducts() {
		return new LinkedHashSet<>(this.products);
	}

	@Override
	public boolean containsProduct(final Product p) {
//		for (final Product p2 : this.products) {
//			if (p2.getName().equals(p.getName())) {
//				return true;
//			}
//		}
//		return false;
		return products.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for (final Product p2 : this.products) {
			if (p2.getName().equals(name)) {
				return p2.getQuantity();
			}
		}
		return -1;
	}

}
