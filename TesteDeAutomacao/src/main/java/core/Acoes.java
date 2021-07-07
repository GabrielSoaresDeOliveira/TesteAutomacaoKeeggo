package core;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acoes {

	private final static CountDownLatch waiter = new CountDownLatch(1);
	private static String date;
	private static String dateTime;
	private static Boolean visibility;
	
	public static void clicar(By element) {
		WebElement wait = new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(element));
		wait.click();
//		esperarElementoSerClicavel(element);
//		Driver.getWebDriver().findElement(element).click();
	}
	
	public static void escrever(By element, String text) {
		Driver.getWebDriver().findElement(element).sendKeys(text);;
	}
	
	public static void esperar(int tempo) {
			try {
				waiter.await(tempo, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	public static String getDate() {
		date = java.time.LocalDate.now().toString();
		return date;
	}

	public static String getDateTime() {
		dateTime = java.time.LocalDateTime.now().toString();
		return dateTime;
	}
	
	public static String getElementText(By element) {
		String text = Driver.getWebDriver().findElement(element).getText();
		return text;
	}
	
	public static void selecionarPorTexto(By element, String texto) {
		Select selecao = new Select(Driver.getWebDriver().findElement(element));
		selecao.selectByVisibleText(texto);
	}

	public static Boolean verificarVisibilidade(By element) {
		try {
			Driver.getWebDriver().findElement(element).isDisplayed();
			visibility = true;
		}catch(NoSuchElementException e) {
			visibility = false;
		}
		return visibility;
	}
}
