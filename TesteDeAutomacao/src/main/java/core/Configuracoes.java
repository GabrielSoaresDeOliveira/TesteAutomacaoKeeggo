package core;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import io.cucumber.java.Scenario;

public class Configuracoes {

	private static String browserVersion ;
	private static String browser;
	private static Properties prop;
	private static String scenario;
	private static boolean testResult;
	private static String showWindow;

	public static void setConfig(Scenario scenario) {
		setScenarioName(scenario.getName());
		try {
			InputStream configProperties = new FileInputStream("./src\\main\\resources\\config.properties");
			prop = new Properties();
			prop.load(configProperties);
			
			setVariables();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void setVariables() {
		browser = prop.getProperty("browser");
		browserVersion = prop.getProperty(browser.toLowerCase() + ".version");
		showWindow = prop.getProperty("show.window");
	}

	public static String getBrowser() {
		return browser;
	}
	
	public static boolean getShowWindow() {
		return showWindow.equals("true");
	}
	
	public static String getBrowserVersion() {
		return browserVersion;
	}
	
	public static void setScenarioName(String scenarioName) {
		scenario = scenarioName;
	}
	
	public static String getScenarioName() {
		return scenario;
	}

	public static void setResult(boolean result) {
		testResult = result;
	}
	
	public static boolean getTestResult() {
		return testResult;
	}

	public static void finishTest() {
		Driver.getWebDriver().quit();
	}

}
