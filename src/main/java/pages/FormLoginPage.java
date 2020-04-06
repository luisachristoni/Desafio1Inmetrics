package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormLoginPage {
	private WebDriver driver;
	
	//construtor
	public FormLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public FormLoginPage digitarDados(String user, String password) {
		String xpathlogin = "//*[@id='signinbox']//input[@name='login']";
		String xpathpasswordin = "//*[@id='signinbox']//input[@name='password']";
		String xpathsigninbutton = "//*[@id='signinbox']//a[text()='Sign in']";
		
		WebElement loginin = driver.findElement(By.xpath(xpathlogin));
		loginin.click();
		loginin.sendKeys(user);
		WebElement passwordin = driver.findElement(By.xpath(xpathpasswordin));
		passwordin.click();
		passwordin.sendKeys(password);
		WebElement signinbutton = driver.findElement(By.xpath(xpathsigninbutton));
		signinbutton.click();
	
		return this;
	}
	
}
