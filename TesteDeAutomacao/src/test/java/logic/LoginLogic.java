package logic;

import core.Acoes;
import pages.UserPage;

public class LoginLogic {

	public static void entrarDadosLogin(String usuario, String senha) {
		Acoes.esperar(5000);
		Acoes.escrever(UserPage.getUsername(), usuario);
		Acoes.escrever(UserPage.getSenha(), senha);
		Acoes.clicar(UserPage.getBtnLogin());
	}
	
	
	
}
