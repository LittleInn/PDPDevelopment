package com.pdp.reflection.development.logger;

public class RunProxyLooger {
public static void main(String[] args) {
	CalculationStrategy calculationStrategy= (CalculationStrategy) CaculationProxy.newInstance(new CalculationStrategyImpl());
	calculationStrategy.calculate(new Cart(100, 200));
}
}
