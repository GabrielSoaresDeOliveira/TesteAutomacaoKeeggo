package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {
	
	private static String browserVersion;
	private static WebDriver driver;
	private static boolean headlessWindow;
	private static String browser;
	
    public static WebDriver getWebDriver(){
    	if(driver == null) {
    	setutDriver();
    	}
		return driver;
    }

	private static void setutDriver() {
		
		getProperties();
		
		if(browser.toLowerCase().equals("firefox")) {
			setupFirefox();
		}
		else if(browser.toLowerCase().equals("chrome")) {
			setupChrome();
		} 
		else if(browser.toLowerCase().equals("edge")) {
			setupEdge();
		}
		else if(browser.toLowerCase().equals("opera")) {
			setupOpera();
		}
		else {
			System.out.println("Navegador não suportado, utilizando o Chrome por padrão");
			setupChrome();
		}
		
    	
	}
	
	private static void getProperties() {
		browser = Configuracoes.getBrowser();
		browserVersion = Configuracoes.getBrowserVersion();
		headlessWindow = !Configuracoes.getShowWindow();
	}

	public static void setupChrome() {
		WebDriverManager.chromedriver().browserVersion(browserVersion).setup();
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("start-maximized"); 
    	options.addArguments("enable-automation"); 
    	options.addArguments("--no-sandbox"); 
    	options.addArguments("--disable-infobars");
    	options.addArguments("--disable-dev-shm-usage");
    	options.addArguments("--disable-browser-side-navigation"); 
    	options.addArguments("--disable-gpu");
    	options.setHeadless(headlessWindow);
    	driver = new ChromeDriver(options); 
    	
	}
	
	public static void setupFirefox() {

		WebDriverManager.firefoxdriver().browserVersion(browserVersion).setup();
    	FirefoxOptions options = new FirefoxOptions();
    	options.addArguments("start-maximized"); 
    	options.addArguments("enable-automation"); 
    	options.addArguments("--no-sandbox"); 
    	options.addArguments("--disable-infobars");
    	options.addArguments("--disable-dev-shm-usage");
    	options.addArguments("--disable-browser-side-navigation"); 
    	options.addArguments("--disable-gpu");
    	options.setHeadless(headlessWindow);
    	driver = new FirefoxDriver(options); 
    	
	}
	
	public static void setupEdge() {

		WebDriverManager.edgedriver().browserVersion(browserVersion).setup();
    	EdgeOptions options = new EdgeOptions();
    	options.addArguments("start-maximized"); 
    	options.addArguments("enable-automation"); 
    	options.addArguments("--no-sandbox"); 
    	options.addArguments("--disable-infobars");
    	options.addArguments("--disable-dev-shm-usage");
    	options.addArguments("--disable-browser-side-navigation"); 
    	options.addArguments("--disable-gpu");
    	options.setHeadless(headlessWindow);
    	driver = new EdgeDriver(options); 
    	
	}
	
	public static void setupOpera() {

		WebDriverManager.operadriver().browserVersion(browserVersion).setup();
    	OperaOptions options = new OperaOptions();
    	options.addArguments("start-maximized"); 
    	options.addArguments("enable-automation"); 
    	options.addArguments("--no-sandbox"); 
    	options.addArguments("--disable-infobars");
    	options.addArguments("--disable-dev-shm-usage");
    	options.addArguments("--disable-browser-side-navigation"); 
    	options.addArguments("--disable-gpu");
    	driver = new OperaDriver(options); 
    	
	}
}
