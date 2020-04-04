package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {
private WebDriver driver;
	
	//construtor
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LogoutPage CheckLogout(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement logout = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Logout']")));
		String textologout = logout.getText();
		Assert.assertEquals("Logout", textologout);
		
		return this;
	} 

}
