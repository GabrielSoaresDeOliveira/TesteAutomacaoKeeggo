# language: pt

@Cadastro @Advantage
Funcionalidade: Cadastro_Novo_Cliente

	Contexto:
  	Eu como novo cliente
  	Quero acessar o site advantageonlineshopping.com
  	Para criar uma nova conta

  Cenário: Cadastro_Novo_Cliente
    Dado que vou para a home page do site
    Quando clico no ícone 'USER'
    E clico em 'CREATE NEW ACCOUNT' para ir a pagina de cadastro
    E entro com meus dados na pagina de cadastro
    Então verifico se estou logado na home page
