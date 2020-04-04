package suport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static WebDriver setupChrome() {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Navegar para a página
		driver.get("http://www.juliodelima.com.br/taskit/");
		
		return driver;
	}

}
