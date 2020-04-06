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
		String idsignup = "signup";
		WebElement signup = driver.findElement(By.id(idsignup));
		signup.click();
		return this;
	}
}
