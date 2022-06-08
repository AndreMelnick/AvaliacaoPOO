// Pacote principal
package projeto;

//Imports
import model.Paineis;
import seguranca.Login;




/**
 *
 * @author André Melnick
 */
public class Principal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criação dos objetos Menu e Login
    	Login login = new Login();
        Paineis menu = new Paineis();
        
        //Chama os métodos para executar o código
        menu.criaPessoaExemplo();
        menu.criaPessoaExemplo2();
        menu.criaPessoaExemplo3();
        login.criaSenha();
        
        //Se o login for válido chama o menu
        if (login.chamaLogin()) {
            menu.chamaMenuPrincipal();
        }
    }

}
