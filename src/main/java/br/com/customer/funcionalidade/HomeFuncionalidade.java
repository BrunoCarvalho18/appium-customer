package br.com.customer.funcionalidade;

import br.com.customer.screens.HomeScreen;

public class HomeFuncionalidade {
	
	HomeScreen home = new HomeScreen();

	public HomeFuncionalidade() {
		home = new HomeScreen();
	}
	
	public void isHome() {
		home.getAddCustomer().isDisplayed();
	}
	
	public void clickAdd() {
		home.getAddCustomer().click();
	}
	
	public String getTextViewNome() {
		return home.getViewNome().getText();
	}
}
