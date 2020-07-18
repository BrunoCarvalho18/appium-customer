package br.com.customer.screens;

import static br.com.customer.driver.Driver.getDriver;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class InsertClientsScreen {

	public InsertClientsScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	@AndroidFindBy(id = "txtNome")
	MobileElement fieldtxtName;

	@AndroidFindBy(id = "txtTelefone")
	MobileElement fieldtxtPhone;

	@AndroidFindBy(id = "txtEmail")
	MobileElement fieldtxtEmail;

	@AndroidFindBy(id = "txtCpf")
	MobileElement fieldtxtCpf;

	@AndroidFindBy(id = "txtDescricao")
	MobileElement fieldtxtDescription;

	@AndroidFindBy(id = "chooseDateButton")
	MobileElement buttonchooseDateButton;

	@AndroidFindBy(id = "button1")
	MobileElement buttonOk;

	@AndroidFindBy(id = "edtObs")
	MobileElement fieldtxtedtObs;
	
	@AndroidFindBy(id = "imageView12")
	MobileElement buttonSave;

	
	public MobileElement getFieldtxtName() {
		return fieldtxtName;
	}

	public MobileElement getFieldtxtPhone() {
		return fieldtxtPhone;
	}

	public MobileElement getFieldtxtEmail() {
		return fieldtxtEmail;
	}

	public MobileElement getFieldtxtCpf() {
		return fieldtxtCpf;
	}

	public MobileElement getFieldtxtDescription() {
		return fieldtxtDescription;
	}

	public MobileElement getButtonchooseDateButton() {
		return buttonchooseDateButton;
	}

	public MobileElement getButtonOk() {
		return buttonOk;
	}

	public MobileElement getFieldtxtedtObs() {
		return fieldtxtedtObs;
	}
	
	public MobileElement getButtonSave() {
		return buttonSave;
	}


}
