package pages;

import org.openqa.selenium.By;

public class GeradorPage {
	
	private static By senha = By.xpath("//*[@id='senha']/span[1]");
	private static By email = By.xpath("//*[@id='email']/span[1]");
	private static By nome = By.xpath("//*[@id='nome']/span[1]");
	private static By telefone = By.xpath("//*[@id='celular']/span[1]");
	private static By cidade = By.xpath("//*[@id='cidade']/span[1]");
	private static By estado = By.xpath("//*[@id='estado']/span[1]");
	private static By endereco = By.xpath("//*[@id='endereco']/span[1]");
	private static By cep = By.xpath("//*[@id='cep']/span[1]");
	private static By btnGerar = By.xpath("//*[@id='bt_gerar_pessoa']");

	public static By getBtnGerar() {
		return btnGerar ;
	}
	public static By getSenha() {
		return senha;
	}
	public static By getEmail() {
		return email;
	}
	public static By getNome() {
		return nome;
	}
	public static By getTelefone() {
		return telefone;
	}
	public static By getCidade() {
		return cidade;
	}
	public static By getEstado() {
		return estado;
	}
	public static By getEndereco() {
		return endereco;
	}
	public static By getCEP() {
		return cep;
	}

}
