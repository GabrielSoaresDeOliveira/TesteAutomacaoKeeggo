package logic;

import static org.junit.Assert.assertTrue;

import core.Acoes;
import core.Configuracoes;
import core.Driver;
import pages.HomePage;
import pages.UserPage;

public class CommonLogic {

	private static String homeUrl = "https://www.advantageonlineshopping.com/#/";


	public static void acessarHome() {
		Driver.getWebDriver().navigate().to(homeUrl);		
	}

	public static void clicarUSER() {
		Acoes.clicar(HomePage.getBtnUser());
	}

	
	public static void validarCadastro() {
		Acoes.esperar(5000);
		Boolean testCondition = Driver.getWebDriver().getCurrentUrl().equals(homeUrl) && !Acoes.verificarVisibilidade(UserPage.getInvalidUser());
		Configuracoes.setResult(testCondition);
		assertTrue(testCondition);
	}
}
