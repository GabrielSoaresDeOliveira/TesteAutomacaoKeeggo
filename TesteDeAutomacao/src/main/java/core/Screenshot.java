package core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {
	
	private static File screenShot;
	
	public static void takeScreenshot() {
		Acoes.esperar(5000);
		screenShot = ((TakesScreenshot)Driver.getWebDriver()).getScreenshotAs(OutputType.FILE);
		salvarEvidencia();
	}
	
	public static void salvarEvidencia() {
		String nomeEvidencia = (Configuracoes.getScenarioName() + "_" + Configuracoes.getTestResult() + "_" 
				+ Acoes.getDateTime().replace(":", "-").replace(".", "-")).toUpperCase() + ".png";
		try {
			FileUtils.copyFile(screenShot, new File("./evidencias\\" + Acoes.getDate() +"\\" + Configuracoes.getTestResult() 
			+ "\\" + nomeEvidencia));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
