package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {	
private WebDriver driver;
	//construtor
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public SignUpPage clicarsignup(){
		WebElement signup = driver.findElement(By.id("signup"));
		signup.click();
		return this;
	}
}
