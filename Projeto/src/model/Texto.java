package model;


// Classe responsável por armazenar textos
public class Texto {

    //Textos de Login
    private String login = "Olá, usuária(o)!\n"
            + "Digite sua senha:";

    private String erroNaSenha = "Senha incorreta!\n"
            + "Caso erre 3 vezes a senha será alterada.\n"
            + "Tentativa nº ";

    private String alterarSenha = "Digite a nova senha:";

    private String senhaRepitida = "A senha inserida é igual a uma das 3 ultimas senhas.\n"
            + "Por favor, insira uma nova senha:";
    
    //Textos de menus
    private String textoMenuPrincipal = "-------------Olá!!--------------\n"
                                      + "  Esta é a sua agenda!\n"
                                      + "Escolha uma das opções a seguir:\n"
                                      + "1 - Ver contatos cadastradas.\n"
                                      + "2 - Cadastar contato.\n"
                                      + "3-  Excluir contato.\n"
                                      + "0-  Sair.";
    
    private String textoContatosCadastrados = "-------------CONTATOS CADASTRADOS--------------\n";
    
    private String textoCadastrarContato = "-------------CADASTRE UM CONTATO--------------\n";
    
    private String textoInserirPais = "Digite o número de um País.\nOu escreva o nome de um País que não está na lista:\n";
    
    private String textoInserirDdi = "Digite o número indicando o DDI de um País.\nOu escreva o número de um DDI que não está na lista: (Ex: +55)\n";
    
    private String textoInserirEstado = "Digite o número de um Estado.\nOu escreva o nome de um Estado que não está na lista:\n";
    
    private String textoInserirCidade = "Digite o número de uma Cidade.\nOu escreva o nome de uma Cidade que não está na lista:\n";
    
    private String textoInserirLogradouro = "Digite o seu logradouro: (Ex: Rua..., Av....) SEM NÚMERO!\n";
    
    private String textoInserirNumero = "Digite o número:\n";
    
    private String textoInserirComplemento = "Digite o complemento, caso tenha:\n";
    
    private String textoInserirNome = "Digite o nome do contato que deseja cadastrar:\n";
    
    private String textoInserirTelefone = "Digite o telefone com DDD: (Ex: (43) 3333-3333 \n";
    
    private String textoExcluirContato = "-------------EXCLUA UM CONTATO--------------\n";
    
    private String textoEscolhaContato = "Escolha um contato:\n";
    
    private String textoSair = "0- Sair\n";
            					 	  	  
    

    
  


	// Gets de Textos
    
    public String getTextoSair() {
		return textoSair;
	}

	public String getTextoInserirNome() {
		return textoInserirNome;
	}

	public String getTextoInserirTelefone() {
		return textoInserirTelefone;
	}

	public String getTextoInserirPais() {
		return textoInserirPais;
	}

	public String getTextoInserirDdi() {
		return textoInserirDdi;
	}

	public String getTextoInserirEstado() {
		return textoInserirEstado;
	}

	public String getTextoInserirCidade() {
		return textoInserirCidade;
	}

	public String getTextoInserirLogradouro() {
		return textoInserirLogradouro;
	}

	public String getTextoInserirNumero() {
		return textoInserirNumero;
	}

	public String getTextoInserirComplemento() {
		return textoInserirComplemento;
	}

	public String getTextoEscolhaContato() {
		return textoEscolhaContato;
	}

	public String getTextoCadastrarContato() {
		return textoCadastrarContato;
	}

	public String getTextoExcluirContato() {
		return textoExcluirContato;
	}

	public String getAlterarSenha() {
        return alterarSenha;
    }

    public String getErroNaSenha() {
        return erroNaSenha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenhaRepitida() {
        return senhaRepitida;
    }
    
    public String getTextoContatosCadastrados() {
  		return textoContatosCadastrados;
  	}

	public String getTextoMenuPrincipal() {
		return textoMenuPrincipal;
	}


    
   
}
