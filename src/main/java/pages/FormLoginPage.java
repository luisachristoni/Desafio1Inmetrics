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
	
	public FormLoginPage digitarDados() {
		WebElement loginin = driver.findElement(By.xpath("//*[@id='signinbox']//input[@name='login']"));
		loginin.click();
		loginin.sendKeys("luisachristoni");
		WebElement passwordin = driver.findElement(By.xpath("//*[@id='signinbox']//input[@name='password']"));
		passwordin.click();
		passwordin.sendKeys("123456");
		WebElement signinbutton = driver.findElement(By.xpath("//*[@id='signinbox']//a[text()='Sign in']"));
		signinbutton.click();
	
		return this;
	}
	
}
