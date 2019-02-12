
package cadastroclientes;

import javax.swing.JFrame;


public class CadastroClientes {

   
    public static void main(String[] args) {
       JFrame frame= new JFrame("Cadastro");
        cadastro painelCadastro= new cadastro();
        
        frame.setSize(800,750);
        frame.add(painelCadastro);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
}
