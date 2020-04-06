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
		String xpathtaskbutton = "//*[text()='Amazing!']/..//a";
		WebElement tasksbutton = driver.findElement(By.xpath(xpathtaskbutton));
		tasksbutton.click();
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		String xpathaddtaskbutton = "//*[@data-target='addtask']";
		WebElement addtasksbutton = driver.findElement(By.xpath(xpathaddtaskbutton));
		addtasksbutton.click();
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		String nametasktitle = "title";
		WebElement tasktitle = driver.findElement(By.name(nametasktitle));
		String xpathtellus = "//*[@placeholder='Tell us, please!']";
		WebElement tellus = driver.findElement(By.xpath(xpathtellus));
		String namedone = "done";
		WebElement done = driver.findElement(By.name(namedone));
		String xpathsavebutton = "//*[text()='Save']";
		WebElement savebutton = driver.findElement(By.xpath(xpathsavebutton));
		
		tasktitle.click();
		tasktitle.sendKeys("Titulo");
		
		String namedatelimit = "date";
		WebElement datelimit = driver.findElement(By.name(namedatelimit));
		// clique com o botão direito do mouse
		Actions oAction = new Actions(driver);
		oAction.moveToElement(datelimit);
		oAction.contextClick(datelimit).build().perform();
		
		String xpathtodaydate = "//button[text()='Today']";
		WebElement todaydate = driver.findElement(By.xpath(xpathtodaydate));
		todaydate.click();
		String xpathokbuttondate = "//button[text()='Ok']";
		WebElement okbuttondate = driver.findElement(By.xpath(xpathokbuttondate));
		okbuttondate.click();

		String nametimelimit = "time";
		WebElement timelimit = driver.findElement(By.name(nametimelimit));
		oAction.moveToElement(timelimit);
		oAction.contextClick(timelimit).build().perform();

		String xpathokbuttontime = "//button[text()='OK']";
		WebElement okbuttontime = driver.findElement(By.xpath(xpathokbuttontime));
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
		String xpathmsgsucesso = "//*[text()='The task has been added, pretty simple!']";
		WebElement msgsucesso = driver.findElement(By.xpath(xpathmsgsucesso));
		String textosucesso = msgsucesso.getText();
		Assert.assertEquals("The task has been added, pretty simple!", textosucesso);
		captura.capturatela(driver, "Report\\Capturas\\Cenario - " + Generator.datetime() + ".png");

		String xpathtaskcriada = "//*[@id='tasklist']/li/span[text()='Titulo']";
		System.out.println(xpathtaskcriada);
		WebElement taskcriada = driver.findElement(By.xpath(xpathtaskcriada));
		String textotaskcriada = taskcriada.getText();
		Assert.assertEquals("Titulo", textotaskcriada);
		
		return this;
	}

}
