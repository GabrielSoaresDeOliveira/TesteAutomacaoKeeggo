package steps;

import io.cucumber.java.pt.E;
import logic.LoginLogic;

public class LoginSteps {
	
	@E("^entro com meu \"([^\"]*)\" e \"([^\"]*)\" para efetuar o login$")
	public void efetuarlogin(String usuario, String senha) {
		LoginLogic.entrarDadosLogin(usuario, senha);
	}
	
}
