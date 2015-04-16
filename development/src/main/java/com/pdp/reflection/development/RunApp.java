package com.pdp.reflection.development;

public class RunApp {
public static void main(String[] args) {
	CalculationStrategy calculationStrategyImpl = new CalculationStrategyImpl();
	calculationStrategyImpl.calculate(new Cart());
}
}
