package br.com.customer.funcionalidade;

import br.com.customer.screens.InsertClientsScreen;

public class InsertClientsFuncionalidade {
	
	InsertClientsScreen insertclients = new InsertClientsScreen();
	
	public InsertClientsFuncionalidade() {
		insertclients = new InsertClientsScreen();
	}
	
	public void writeName(String name) {
		insertclients.getFieldtxtName().sendKeys(name);
	}
	
	public void writePhone(String phone) {
		insertclients.getFieldtxtPhone().sendKeys(phone);
	}
	
	public void writeEmail(String email) {
		insertclients.getFieldtxtEmail().sendKeys(email);
	}
	
	public void writeCPF(String cpf) {
		insertclients.getFieldtxtCpf().sendKeys(cpf);
	}
	
	public void writeDescription(String description) {
		insertclients.getFieldtxtDescription().sendKeys(description);
	}
	
	public void clickCalendarButton() {
		insertclients.getButtonchooseDateButton().click();
	}
	
	public void clickButtonOk() {
		insertclients.getButtonOk().click();
	}
	
	public void writeComments(String comments) {
		insertclients.getFieldtxtedtObs().sendKeys(comments);
	}
	
	public void clickSave() {
		insertclients.getButtonSave().click();
	}
}
