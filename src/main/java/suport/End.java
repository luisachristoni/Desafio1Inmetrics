package suport;

import org.openqa.selenium.WebDriver;

public class End {
	
	public static void finalizaChrome (WebDriver driver){
		captura.capturatela(driver, "src\\main\\resources\\Report\\Capturas\\Final Cenario - " + Generator.datetime() + ".png");
		driver.quit();
	}

}
