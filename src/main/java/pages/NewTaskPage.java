package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import suport.Generator;
import suport.GeradorNumero;
import suport.captura;

public class NewTaskPage {
	private WebDriver driver;
	//construtor
	public NewTaskPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public NewTaskPage criarTask(){
		WebElement tasksbutton = driver.findElement(By.xpath("//*[text()='Amazing!']/..//a"));
		tasksbutton.click();
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		WebElement addtasksbutton = driver.findElement(By.xpath("//*[@data-target='addtask']"));
		addtasksbutton.click();
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		WebElement tasktitle = driver.findElement(By.name("title"));
		WebElement tellus = driver.findElement(By.xpath("//*[@placeholder='Tell us, please!']"));
		WebElement done = driver.findElement(By.name("done"));
		WebElement savebutton = driver.findElement(By.xpath("//*[text()='Save']"));
		tasktitle.click();
		tasktitle.sendKeys("Titulo");

		WebElement datelimit = driver.findElement(By.name("date"));
		// clique com o botão direito do mouse
		Actions oAction = new Actions(driver);
		oAction.moveToElement(datelimit);
		oAction.contextClick(datelimit).build().perform();
		WebElement todaydate = driver.findElement(By.xpath("//button[text()='Today']"));
		todaydate.click();
		WebElement okbuttondate = driver.findElement(By.xpath("//button[text()='Ok']"));
		okbuttondate.click();

		WebElement timelimit = driver.findElement(By.name("time"));
		oAction.moveToElement(timelimit);
		oAction.contextClick(timelimit).build().perform();

		WebElement okbuttontime = driver.findElement(By.xpath("//button[text()='OK']"));
		okbuttontime.click();

		tellus.sendKeys("Desafio");

		Select combo = new Select(done);
		int numcombo = GeradorNumero.geraCombo();
		combo.selectByIndex(numcombo);
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		savebutton.click();
		return this;
	}
	
	public NewTaskPage checkTask(){
		WebElement msgsucesso = driver.findElement(By.xpath("//*[text()='The task has been added, pretty simple!']"));
		String textosucesso = msgsucesso.getText();
		Assert.assertEquals("The task has been added, pretty simple!", textosucesso);
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		WebElement taskcriada = driver.findElement(By.xpath("//*[@id='tasklist']/li/span[text()='Titulo']"));
		String textotaskcriada = taskcriada.getText();
		Assert.assertEquals("Titulo", textotaskcriada);
		
		return this;
	}

}
