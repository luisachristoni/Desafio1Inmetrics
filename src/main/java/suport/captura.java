package suport;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captura {
	public static void capturatela (WebDriver driver, String file){
		System.out.println("Capturando Tela");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(file));
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

}
