package br.com.customer.suite;


import org.junit.AfterClass;
import br.com.customer.driver.Driver;

public class Hooks {
	
	@AfterClass
	public void encerrarSuiteTeste() {
		Driver.encerrarDriver();
	}

}
