package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import logic.CommonLogic;

public class CommonSteps {
	
	@Dado("^que vou para a home page do site$")
	public void homePage() {
		CommonLogic.acessarHome();
	}
	
	@Quando("^clico no ícone 'USER'$")
	public void btnUser() {
		CommonLogic.clicarUSER();
	}
	
	
	@Então("^verifico se estou logado na home page$")
	public void verificar() {
		CommonLogic.validarCadastro();
	}
}
