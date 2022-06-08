package model;


// Classe respons�vel por armazenar textos
public class Texto {

    //Textos de Login
    private String login = "Ol�, usu�ria(o)!\n"
            + "Digite sua senha:";

    private String erroNaSenha = "Senha incorreta!\n"
            + "Caso erre 3 vezes a senha ser� alterada.\n"
            + "Tentativa n� ";

    private String alterarSenha = "Digite a nova senha:";

    private String senhaRepitida = "A senha inserida � igual a uma das 3 ultimas senhas.\n"
            + "Por favor, insira uma nova senha:";
    
    //Textos de menus
    private String textoMenuPrincipal = "-------------Ol�!!--------------\n"
                                      + "  Esta � a sua agenda!\n"
                                      + "Escolha uma das op��es a seguir:\n"
                                      + "1 - Ver contatos cadastradas.\n"
                                      + "2 - Cadastar contato.\n"
                                      + "3-  Excluir contato.\n"
                                      + "0-  Sair.";
    
    private String textoContatosCadastrados = "-------------CONTATOS CADASTRADOS--------------\n";
    
    private String textoCadastrarContato = "-------------CADASTRE UM CONTATO--------------\n";
    
    private String textoInserirPais = "Digite o n�mero de um Pa�s.\nOu escreva o nome de um Pa�s que n�o est� na lista:\n";
    
    private String textoInserirDdi = "Digite o n�mero indicando o DDI de um Pa�s.\nOu escreva o n�mero de um DDI que n�o est� na lista: (Ex: +55)\n";
    
    private String textoInserirEstado = "Digite o n�mero de um Estado.\nOu escreva o nome de um Estado que n�o est� na lista:\n";
    
    private String textoInserirCidade = "Digite o n�mero de uma Cidade.\nOu escreva o nome de uma Cidade que n�o est� na lista:\n";
    
    private String textoInserirLogradouro = "Digite o seu logradouro: (Ex: Rua..., Av....) SEM N�MERO!\n";
    
    private String textoInserirNumero = "Digite o n�mero:\n";
    
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
