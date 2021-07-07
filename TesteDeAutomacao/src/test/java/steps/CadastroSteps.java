package steps;


import io.cucumber.java.pt.E;
import logic.CadastroLogic;
import logic.GeradorLogic;

public class CadastroSteps {
	
	@E("^clico em 'CREATE NEW ACCOUNT' para ir a pagina de cadastro$")
	public void btnCreateNewAccount() {
		CadastroLogic.clicarCreateNewAccount();
	}
	
	@E("^entro com meus dados na pagina de cadastro$")
	public void dadoCadastro() {
		GeradorLogic.gerar();
		CadastroLogic.preencherDadosDeCadastro();
	}
	
}
