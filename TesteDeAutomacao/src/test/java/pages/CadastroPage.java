package pages;

import org.openqa.selenium.By;

public class CadastroPage {

	private static By username = By.xpath("//*[@name='usernameRegisterPage']");
	private static By email = By.xpath("//*[@name='emailRegisterPage']");
	private static By senha = By.xpath("//*[@name='passwordRegisterPage']");
	private static By confirmarSenha = By.xpath("//*[@name='confirm_passwordRegisterPage']");
	private static By nome = By.xpath("//*[@name='first_nameRegisterPage']");
	private static By sobrenome = By.xpath("//*[@name='last_nameRegisterPage']");
	private static By telefone = By.xpath("//*[@name='phone_numberRegisterPage']");
	private static By cidade = By.xpath("//*[@name='cityRegisterPage']");
	private static By endereco = By.xpath("//*[@name='addressRegisterPage']");
	private static By estado = By.xpath("//*[@name='state_/_province_/_regionRegisterPage']");
	private static By cep = By.xpath("//*[@name='postal_codeRegisterPage']");
	private static By pais = By.xpath("//*[@name='countryListboxRegisterPage']");
	private static By btnTermo = By.xpath("//*[@name='i_agree']");
	private static By btnCadastro = By.xpath("//*[@id='register_btnundefined']");

	public static By getUsername() {
		return username;
	}

	public static By getEmail() {
		return email ;
	}

	public static By getSenha() {
		return senha;
	}

	public static By getCornfirmarSenha() {
		return confirmarSenha;
	}

	public static By getNome() {
		return nome;
	}

	public static By getSobrenome() {
		return sobrenome;
	}

	public static By getTelefone() {
		return telefone;
	}

	public static By getCidade() {
		return cidade;
	}

	public static By getEndereco() {
		return endereco;
	}

	public static By getEstado() {
		return estado;
	}

	public static By getCEP() {
		return cep;
	}

	public static By getPais() {
		return pais;
	}

	public static By getCheckTermo() {
		return btnTermo;
	}

	public static By btnCadastro() {
		return btnCadastro;
	}

}
