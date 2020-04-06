package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import suport.Converte;
import suport.GeradorNumero;

public class SignUpFormPage {
	private WebDriver driver;
	
	//construtor
	public SignUpFormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public SignUpFormPage digitarDadosCadastro() {
		int numero = GeradorNumero.gera100000();
		String logincadastro = Converte.numeroToNewString(numero, "Desafio");
		// Name
		String xpathnameup = "//*[@id='signupbox']//input[@name='name']";
		WebElement nameup = driver.findElement(By.xpath(xpathnameup));
		nameup.click();
		nameup.sendKeys("Desafio");
		// Login
		String xpathloginup = "//*[@id='signupbox']//input[@name='login']";
		WebElement loginup = driver.findElement(By.xpath(xpathloginup));
		loginup.click();
		loginup.sendKeys(logincadastro);
		// Password
		String xpathpasswordup = "//*[@id='signupbox']//input[@name='password']";
		WebElement passwordup = driver.findElement(By.xpath(xpathpasswordup));
		passwordup.click();
		passwordup.sendKeys("Desafio");
		return this;
	}
	
	public SignUpFormPage clickSalvar(){
		String xpathsavebutton = "//a[text()='Save']";
		WebElement savebutton = driver.findElement(By.xpath(xpathsavebutton));
		savebutton.click();
		return this;
	}
	

}
