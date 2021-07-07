package pages;

import org.openqa.selenium.By;

public class UserPage {

	private static By btnCreateNewAccount = By.xpath("//*[@class='create-new-account ng-scope']");
	private static By username = By.xpath("//*[@name='username']");
	private static By senha = By.xpath("//*[@name='password']");
	private static By btnLogin = By.xpath("//*[@id='sign_in_btnundefined']");
	private static By invalidUser = By.xpath("//*[@class='or  center invalid']");

	public static By getCreateNewAccountBtn() {
		return btnCreateNewAccount;
	}

	public static By getUsername() {
		return username ;
	}

	public static By getSenha() {
		return senha ;
	}

	public static By getBtnLogin() {
		return btnLogin;
	}
	
	public static By getInvalidUser() {
		return invalidUser;
	}

}
