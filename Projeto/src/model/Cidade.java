package model;

public class Cidade {
	//Atributos
	private String nome;
    private Estado estado;
    
    
    //Gets e Setts
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	//toString
	@Override
	public String toString() {
		return "Cidade: " + nome + "\n" + estado;
	}
    
    

}
