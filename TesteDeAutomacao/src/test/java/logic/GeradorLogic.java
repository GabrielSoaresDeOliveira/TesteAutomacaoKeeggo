package logic;

import pages.GeradorPage;
import core.Acoes;
import core.Driver;
import core.Janela;

public class GeradorLogic {

	private static String geradorURL = "https://www.4devs.com.br/gerador_de_pessoas";
	private static String senha;
	private static String email;
	private static String nome;
	private static String sobrenome;
	private static String telefone;
	private static String cidade;
	private static String estado;
	private static String endereco;
	private static String cep;
	private static String nomeCompleto[];
	private static String username;

	public static void gerar() {
		Janela.novaGuia();
		Driver.getWebDriver().navigate().to(geradorURL );
		Acoes.clicar(GeradorPage.getBtnGerar());
		Acoes.esperar(3000);
		senha = Acoes.getElementText(GeradorPage.getSenha()).substring(0,8) + "#A1";
		username = senha.replace("#A1", "");
		email = Acoes.getElementText(GeradorPage.getEmail());
		nomeCompleto = Acoes.getElementText(GeradorPage.getNome())
				.split(" ");
		telefone = Acoes.getElementText(GeradorPage.getTelefone());
		cidade = Acoes.getElementText(GeradorPage.getCidade());
		estado = Acoes.getElementText(GeradorPage.getEstado());
		endereco = Acoes.getElementText(GeradorPage.getEndereco());
		cep = Acoes.getElementText(GeradorPage.getCEP());
		
		nome = nomeCompleto[0];
		sobrenome = nomeCompleto[nomeCompleto.length - 1];
		
		Janela.fecharJanela(1);
		Janela.mudarJanela(0);
		
	}
	
	public static String getSenha() {
		return senha;
	}
	public static String getUsername() {
		return username;
	}
	public static String getEmail() {
		return email;
	}
	public static String getNome() {
		return nome;
	}
	public static String getSobrenome() {
		return sobrenome;
	}
	public static String getTelefone() {
		return telefone;
	}
	public static String getCidade() {
		return cidade;
	}
	public static String getEstado() {
		return estado;
	}
	public static String getEndereco() {
		return endereco;
	}
	public static String getCEP() {
		return cep;
	}
	
}
