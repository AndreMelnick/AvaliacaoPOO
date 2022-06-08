package model;


public class Pessoa {
	//Atributos
	private String nome;
	private String telefone;
	private Endereco endereco;
	
	
	// Gatts e Setts
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
			 + "Telefone: " + endereco.getCidade().getEstado().getPais().getDdi() 
			 + " " + telefone + "\n"
			 + endereco + "\n";
	}
	
	
    
}
