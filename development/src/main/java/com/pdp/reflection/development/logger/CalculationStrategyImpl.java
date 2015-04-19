package com.pdp.reflection.development.logger;

public class CalculationStrategyImpl implements CalculationStrategy{

	@Override
	public long calculate(Cart cart) {
		return cart.getPrev() + cart.getCurrent();
	}

}
