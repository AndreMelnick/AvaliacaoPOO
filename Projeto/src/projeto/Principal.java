// Pacote principal
package projeto;

//Imports
import model.Paineis;
import seguranca.Login;




/**
 *
 * @author Andr� Melnick
 */
public class Principal {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria��o dos objetos Menu e Login
    	Login login = new Login();
        Paineis menu = new Paineis();
        
        //Chama os m�todos para executar o c�digo
        menu.criaPessoaExemplo();
        menu.criaPessoaExemplo2();
        menu.criaPessoaExemplo3();
        login.criaSenha();
        
        //Se o login for v�lido chama o menu
        if (login.chamaLogin()) {
            menu.chamaMenuPrincipal();
        }
    }

}
