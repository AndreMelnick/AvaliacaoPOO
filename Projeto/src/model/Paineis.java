package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paineis {
	//Atributos
	private String pessoaTemporaria = "";
	private String teste= "not null";
	private Texto texto = new Texto();
	
	//Array para criar lista de pessoas
	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	
	//Criando pessoa de exemplo 1
	public void criaPessoaExemplo() {
		Pessoa novaPessoa = new Pessoa();
		Pais pais = new Pais();
		Estado estado = new Estado();
		Cidade cidade = new Cidade();
		Endereco endereco = new Endereco();
		
		novaPessoa.setNome("UNOPAR");
		novaPessoa.setTelefone("43 3371-7805");
		novaPessoa.setEndereco(endereco);
		novaPessoa.getEndereco().setLogradouro("Av. Paris");
		novaPessoa.getEndereco().setNumero("675");
		novaPessoa.getEndereco().setComplemento("");
		novaPessoa.getEndereco().setCidade(cidade);
		novaPessoa.getEndereco().getCidade().setNome("Londrina");
		novaPessoa.getEndereco().getCidade().setEstado(estado);
		novaPessoa.getEndereco().getCidade().getEstado().setNome("Paraná");
		novaPessoa.getEndereco().getCidade().getEstado().setPais(pais);
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setNome("Brasil");
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setDdi("+55");
		
		pessoas.add(novaPessoa);
		
		
		
		
				
	}
	
	
	//Criando pessoa de exemplo 2
	public void criaPessoaExemplo2() {
		Pessoa novaPessoa = new Pessoa();
		Pais pais = new Pais();
		Estado estado = new Estado();
		Cidade cidade = new Cidade();
		Endereco endereco = new Endereco();
		
		novaPessoa.setNome("Pitágoras");
		novaPessoa.setTelefone("43 3371-7805");
		novaPessoa.setEndereco(endereco);
		novaPessoa.getEndereco().setLogradouro("Av. Paris");
		novaPessoa.getEndereco().setNumero("675");
		novaPessoa.getEndereco().setComplemento("");
		novaPessoa.getEndereco().setCidade(cidade);
		novaPessoa.getEndereco().getCidade().setNome("Londrina");
		novaPessoa.getEndereco().getCidade().setEstado(estado);
		novaPessoa.getEndereco().getCidade().getEstado().setNome("Paraná");
		novaPessoa.getEndereco().getCidade().getEstado().setPais(pais);
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setNome("Brasil");
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setDdi("+55");
		
		pessoas.add(novaPessoa);
	}
	
	
	//Criando pessoa de exemplo 3
	public void criaPessoaExemplo3() {
		Pessoa novaPessoa = new Pessoa();
		Pais pais = new Pais();
		Estado estado = new Estado();
		Cidade cidade = new Cidade();
		Endereco endereco = new Endereco();
		
		novaPessoa.setNome("HARVARD");
		novaPessoa.setTelefone("617-495-1000");
		novaPessoa.setEndereco(endereco);
		novaPessoa.getEndereco().setLogradouro("Campus");
		novaPessoa.getEndereco().setNumero("S/N");
		novaPessoa.getEndereco().setComplemento("");
		novaPessoa.getEndereco().setCidade(cidade);
		novaPessoa.getEndereco().getCidade().setNome("Cambrige");
		novaPessoa.getEndereco().getCidade().setEstado(estado);
		novaPessoa.getEndereco().getCidade().getEstado().setNome("MA");
		novaPessoa.getEndereco().getCidade().getEstado().setPais(pais);
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setNome("EUA");
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setDdi("+1");
		
		pessoas.add(novaPessoa);
		
		
				
	}
	
	//Método para listar contatos
	public String listaPessoas() {
		pessoaTemporaria = "";
		pessoaTemporaria += texto.getTextoEscolhaContato() + "\n";
		for (int i = 0; i < pessoas.size(); i++) {
			pessoaTemporaria += (i+1) + "- " + pessoas.get(i).getNome() + "\n";
		}
		pessoaTemporaria += texto.getTextoSair();
		return pessoaTemporaria;
	}
	
	
	//Método para chamar a lista de contatos
	public void chamaContatoCadastrados() {
		pessoaTemporaria = "";
		pessoaTemporaria = texto.getTextoContatosCadastrados() + "\n";
		pessoaTemporaria += listaPessoas();
		pessoaTemporaria = JOptionPane.showInputDialog(null, pessoaTemporaria);
		
		if (pessoaTemporaria.equals("0")) {
			chamaMenuPrincipal();
		} else {
			int contador = Integer.parseInt(pessoaTemporaria);
			JOptionPane.showConfirmDialog(null, pessoas.get(contador - 1).toString());
		}
			
	}
	
	
	
	//Método para cadastrar contatos
	public void cadastrarContato() {
		Pessoa novaPessoa = new Pessoa();
		Pais pais = new Pais();
		Estado estado = new Estado();
		Cidade cidade = new Cidade();
		Endereco endereco = new Endereco();
		
		novaPessoa.setNome(JOptionPane.showInputDialog(null, texto.getTextoInserirNome()));
		novaPessoa.setTelefone(JOptionPane.showInputDialog(null, texto.getTextoInserirTelefone()));
		novaPessoa.setEndereco(endereco);
		novaPessoa.getEndereco().setLogradouro(JOptionPane.showInputDialog(null, texto.getTextoInserirLogradouro()));
		novaPessoa.getEndereco().setNumero(JOptionPane.showInputDialog(null, texto.getTextoInserirNumero()));
		novaPessoa.getEndereco().setComplemento(JOptionPane.showInputDialog(null, texto.getTextoInserirComplemento()));
		novaPessoa.getEndereco().setCidade(cidade);
		novaPessoa.getEndereco().getCidade().setNome(cadastraCidade());
		novaPessoa.getEndereco().getCidade().setEstado(estado);
		novaPessoa.getEndereco().getCidade().getEstado().setNome(cadastraEstado());
		novaPessoa.getEndereco().getCidade().getEstado().setPais(pais);
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setNome(cadastraPais());
		novaPessoa.getEndereco().getCidade().getEstado().getPais().setDdi(cadastraDdi());
		
		pessoas.add(novaPessoa);
		;
	}
	
	//Método para verificar e cadastrar cidades
	public String cadastraCidade() {
		String cidade = "";
		String temporaria = "";
		temporaria += texto.getTextoInserirCidade();
		
		for (int i = 0; i < pessoas.size(); i++) {
			int j = pessoas.size() - 1;
			boolean teste = false;
			boolean marcador = false;
			
			do {
				if(pessoas.size() == 1 || i == 0){
					j = 0;
				}else if(pessoas.get(j).getEndereco().getCidade().getNome().equals(
								 pessoas.get(i).getEndereco().getCidade().getNome()) && i != j) {
					marcador = true;
					j++;
				}
				j--;
			} while( j >= 0 && marcador != true);
			
			if(j < 0) {
				teste = true;
			}
				
			if (teste) {
				temporaria += (i + 1) + "- " + pessoas.get(i).getEndereco().getCidade().getNome() + "\n";
			}
			
		}
		
		temporaria = JOptionPane.showInputDialog(null, temporaria);
		
		
		boolean isNumeric =  temporaria.matches("[+-]?\\d*(\\.\\d+)?");
		
		if(isNumeric) {
			int opcao = Integer.parseInt(temporaria);
			cidade = pessoas.get(opcao - 1).getEndereco().getCidade().getNome();
		} else {
			cidade = temporaria;
		}
		return cidade;
	}
	
	
	
	//Método para verificar e cadastrar Estados
	public String cadastraEstado() {
		String estado = "";
		String temporaria = "";
		temporaria += texto.getTextoInserirEstado();
		
		for (int i = 0; i < pessoas.size(); i++) {
			int j = pessoas.size() - 1;
			boolean teste = false;
			boolean marcador = false;
			
			do {
				if(pessoas.size() == 1 || i == 0){
					j = 0;
				}else if(pessoas.get(j).getEndereco().getCidade().getEstado().getNome().equals(
								 pessoas.get(i).getEndereco().getCidade().getEstado().getNome()) && i != j) {
					marcador = true;
					j++;
				}
				j--;
			} while( j >= 0 && marcador != true);
			
			if(j < 0) {
				teste = true;
			}
				
			if (teste) {
				temporaria += (i + 1) + "- " + pessoas.get(i).getEndereco().getCidade().getEstado().getNome() + "\n";
			}
			
		}
		
		temporaria = JOptionPane.showInputDialog(null, temporaria);
		
		
		boolean isNumeric =  temporaria.matches("[+-]?\\d*(\\.\\d+)?");
		
		if(isNumeric) {
			int opcao = Integer.parseInt(temporaria);
			estado = pessoas.get(opcao - 1).getEndereco().getCidade().getEstado().getNome();
		} else {
			estado = temporaria;
		}
		return estado;
	}
	
	
	
	
	//Método para verificar e cadastrar Países
	public String cadastraPais() {
		String pais = "";
		String temporaria = "";
		temporaria += texto.getTextoInserirPais();
		
		for (int i = 0; i < pessoas.size(); i++) {
			int j = pessoas.size() - 1;
			boolean teste = false;
			boolean marcador = false;
			
			do {
				if(pessoas.size() == 1 || i == 0){
					j = 0;
				}else if(pessoas.get(j).getEndereco().getCidade().getEstado().getPais().getNome().equals(
								 pessoas.get(i).getEndereco().getCidade().getEstado().getPais().getNome()) && i != j) {
					marcador = true;
					j++;
				}
				j--;
			} while( j >= 0 && marcador != true);
			
			if(j < 0) {
				teste = true;
			}
				
			if (teste) {
				temporaria += (i + 1) + "- " + pessoas.get(i).getEndereco().getCidade().getEstado().getPais().getNome() + "\n";
			}
			
		}
		
		temporaria = JOptionPane.showInputDialog(null, temporaria);
		
		
		boolean isNumeric =  temporaria.matches("[+-]?\\d*(\\.\\d+)?");
		
		if(isNumeric) {
			int opcao = Integer.parseInt(temporaria);
			pais = pessoas.get(opcao - 1).getEndereco().getCidade().getEstado().getPais().getNome();
		} else {
			pais = temporaria;
		}
		return pais;
	}
	
	
	
	
	//Método para verificar e cadastrar DDI
	public String cadastraDdi() {
		String ddi = "";
		String temporaria = "";
		temporaria += texto.getTextoInserirDdi();
		
		for (int i = 0; i < pessoas.size(); i++) {
			int j = pessoas.size() - 1;
			boolean teste = false;
			boolean marcador = false;
			
			do {
				if(pessoas.size() == 1 || i == 0){
					j = 0;
				}else if(pessoas.get(j).getEndereco().getCidade().getEstado().getPais().getDdi().equals(
								 pessoas.get(i).getEndereco().getCidade().getEstado().getPais().getDdi()) && i != j) {
					marcador = true;
					j++;
				}
				j--;
			} while( j >= 0 && marcador != true);
			
			if(j < 0) {
				teste = true;
			}
				
			if (teste) {
				temporaria += (i + 1) + "- " + pessoas.get(i).getEndereco().getCidade().getEstado().getPais().getDdi() + "\n";
			}
			
		}
		
		temporaria = JOptionPane.showInputDialog(null, temporaria);
		
		
		boolean isNumeric =  temporaria.matches("[-]?\\d*(\\.\\d+)?");
		
		if(isNumeric) {
			int opcao = Integer.parseInt(temporaria);
			ddi = pessoas.get(opcao - 1).getEndereco().getCidade().getEstado().getPais().getDdi();
		} else {
			ddi = temporaria;
		}
		return ddi;
	}
	
	
	
	
	//Método para excluir eventos
		public void excluirContato() {
			String pessoaTemporaria = texto.getTextoExcluirContato() + "\n";
			pessoaTemporaria += listaPessoas();
			pessoaTemporaria = JOptionPane.showInputDialog(null, pessoaTemporaria);
			
			if (pessoaTemporaria.equals("0")) {
				chamaMenuPrincipal();
			} else {
				int contador = Integer.parseInt(pessoaTemporaria);
				JOptionPane.showConfirmDialog(null, pessoas.get(contador - 1).getNome() + " foi excluído!");
				pessoas.remove(contador - 1);
			}
		}

	
		
		
	//Método do menu principal
    public void chamaMenuPrincipal(){
    	while(!teste.equals("0")){
        	String teste = JOptionPane.showInputDialog(null, texto.getTextoMenuPrincipal());
        	switch (teste) {
        	case "1":
        		pessoaTemporaria = "";
        		chamaContatoCadastrados();
        		break;
        	case "2":
        		cadastrarContato();
        		break;
        	case "3":
        		pessoaTemporaria = "";
        		excluirContato();
        		break;
        	case "0":
        		this.teste = "0";
        		break;
        		default:
        			
        	}
        }
    }

}
