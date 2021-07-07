package pages;

import org.openqa.selenium.By;

public class HomePage 
{

	private static By btnUser = By.xpath("//*[@id='menuUser']");

	public static By getBtnUser() {
		return btnUser ;
	}
}
