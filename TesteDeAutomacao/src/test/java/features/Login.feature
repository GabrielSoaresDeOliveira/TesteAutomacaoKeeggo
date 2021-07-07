# language: pt

@Login @Advantage
Funcionalidade: Login_Cliente_Ja_Cadastrado

	Contexto:
  	Eu como cliente já cadastrado
  	Quero acessar o site advantageonlineshopping.com
  	Para fazer login na minha conta
  	
  Cenário: Login_Cliente_Ja_Cadastrado
    Dado que vou para a home page do site
    Quando clico no ícone 'USER'
    E entro com meu "<usuário>" e "<senha>" para efetuar o login
    Então verifico se estou logado na home page

    
    Exemplos:
    	|usuário|senha|
    	|TesteKeeggo|Keeggo10|
