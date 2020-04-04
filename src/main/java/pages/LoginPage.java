package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	
	//construtor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage clicarsignin(){
		WebElement signin = driver.findElement(By.xpath("(//*[text()='Sign in'])[1]"));
		signin.click();
		
		return this;
	}
	
}
