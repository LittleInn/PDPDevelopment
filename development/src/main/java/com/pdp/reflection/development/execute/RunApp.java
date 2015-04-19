package com.pdp.reflection.development.execute;

import org.apache.log4j.Logger;

import com.pdp.reflection.development.deepcopy.Address;
import com.pdp.reflection.development.deepcopy.DeepCopy;
import com.pdp.reflection.development.deepcopy.Employee;
import com.pdp.reflection.development.deepcopy.User;
import com.pdp.reflection.development.logger.CaculationProxy;
import com.pdp.reflection.development.logger.CalculationStrategy;
import com.pdp.reflection.development.logger.CalculationStrategyImpl;
import com.pdp.reflection.development.logger.Cart;

public class RunApp {
	private static Logger LOGGER = Logger.getLogger(RunApp.class);
	protected static void runDeepCopy(){
		LOGGER.info("--------------------------- Deep Copy Example --------------------");
		User user1 = new User("Alex", "alex@mail.com", "IE4523");
		User user2 = new User("John", "john90@mail.com", "A49023");
		Address address1 = new Address("Lviv", "78439");
		Address address2 = new Address("Kyiv", "12355");
		Employee employee1 = new Employee("Emma", "emm00@mail.com", "HJ9012",
				800.00, "D45", "manager",address1);
		Employee employee2 = new Employee("Keit", "keit@mail.com", "OP9122",
				940.00, "A95", "developer", address2);

		LOGGER.info("Employee1: " + employee1);
		LOGGER.info("Employee2: " + employee2);
		DeepCopy.copy(user1, user2);
		DeepCopy.copy(employee1, employee2);
		LOGGER.info("Objects after copy");
		LOGGER.info("Employee1: " + employee1);
		LOGGER.info("Employee2: " + employee2);
		LOGGER.info("Employee1 zip code: " + employee1.getAddress().getZipCode());
		LOGGER.info("Employee2 zip code: " + employee2.getAddress().getZipCode());
	}
	protected static void runProxyLogger(){
		LOGGER.info("--------------------------- Dynamic Proxy Logger Example --------------------");
		CalculationStrategy calculationStrategy= (CalculationStrategy) CaculationProxy.newInstance(new CalculationStrategyImpl());
		calculationStrategy.calculate(new Cart(100, 200));
	}
	public static void main(String[] args) {
		RunApp.runDeepCopy();
		RunApp.runProxyLogger();
	}
}