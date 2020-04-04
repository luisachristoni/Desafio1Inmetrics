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
		String logincadastro = Converte.numeroToLogin(numero);
		// Name
		WebElement nameup = driver.findElement(By.xpath("//*[@id='signupbox']//input[@name='name']"));
		nameup.click();
		nameup.sendKeys("Desafio");
		// Login
		WebElement loginup = driver.findElement(By.xpath("//*[@id='signupbox']//input[@name='login']"));
		loginup.click();
		loginup.sendKeys(logincadastro);
		// Password
		WebElement passwordup = driver.findElement(By.xpath("//*[@id='signupbox']//input[@name='password']"));
		passwordup.click();
		passwordup.sendKeys("Desafio");
		return this;
	}
	
	public SignUpFormPage clickSalvar(){
		WebElement savebutton = driver.findElement(By.xpath("//a[text()='Save']"));
		savebutton.click();
		return this;
	}
	

}
