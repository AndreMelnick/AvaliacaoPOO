package seguranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Texto;

public class Login {
	//Atributos
    private String senhaDeAcesso;
    private String senhaTemporaria;
    private Texto textoLogin = new Texto();
    private int contador = 0;
    //ArrayList de senhas
    ArrayList<String> senhas = new ArrayList<>();
    
    //Cria 3 senhas padrões iniciais
    public void criaSenha() {
        senhas.add("0000");
        senhas.add("0001");
        senhas.add("0002");
    }
    //Método para validação do login
    public boolean chamaLogin() {
        this.senhaDeAcesso = JOptionPane.showInputDialog(null,
                textoLogin.getLogin());
        
        while(!senhaDeAcesso.equals(senhas.get(senhas.size()-1))){
        if(contador < 2){
                contador++;
                senhaDeAcesso = JOptionPane.showInputDialog(null, 
                        textoLogin.getErroNaSenha() + (contador + 1));
            } else if(contador == 2){
                senhaTemporaria = JOptionPane.showInputDialog(null, textoLogin.getAlterarSenha());
                while(senhaTemporaria.equals(senhas.get(senhas.size()-1)) 
                      || senhaTemporaria.equals(senhas.get(senhas.size()-2))
                      || senhaTemporaria.equals(senhas.get(senhas.size()-3))){
                    
                    senhaTemporaria = JOptionPane.showInputDialog(null, textoLogin.getSenhaRepitida());
                    
                }
                senhas.add(senhaTemporaria);
                senhaDeAcesso = senhas.get(senhas.size()-1);
            } 
    }
         return true;

    }
         

    /*
              
    }
     */
}
