package model;

public class Estado {
	//Atributos
	private String nome;
    private Pais pais;
    
    
    
    //Gets e Setts
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Estado: " + nome  + "\n" + pais;
	}
    
    
}
