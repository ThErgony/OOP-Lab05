package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private double quantity;
	
	
	
	public ProductImpl(final String name, final double quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}

}
