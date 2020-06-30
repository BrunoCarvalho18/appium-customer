package br.com.customer.screens;

import static br.com.customer.driver.Driver.getDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreen {

	public HomeScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
	
	@AndroidFindBy(accessibility = "")
    MobileElement menu;

}
