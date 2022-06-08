package model;

public class Pais {
	//Atributos
	private String nome;
    private String ddi;
    
    
    //Gets e Setts
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDdi() {
		return ddi;
	}
	public void setDdi(String ddi) {
		this.ddi = ddi;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Pais: " + nome + "\n";
	}

	
}
