package model;

public class Endereco {
	//Atributos
	private Cidade cidade;
	private String logradouro;
	private String numero;
	private String complemento;
	
	//Gets e Setts
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Endereco: " + logradouro + ", nº " + numero + " "
				+ complemento + "\n" +  cidade;
	}
	
	
	
	
	
}
