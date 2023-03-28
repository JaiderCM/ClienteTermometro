package presentacion;

import java.io.IOException;
import logica.Cliente;


public class Modelo {

    private Cliente appCliente;
    private TermometroRender termometroRender;
   // TermometroRender termometroRender = TermometroRender();

    public TermometroRender getTermometroRender() {
        if(termometroRender == null){
            termometroRender = new TermometroRender();
        }
        return termometroRender;
    }
    
    
    public Modelo() {
        
        fcnew Termometro().setVisible(true);
    }

    public Cliente getAppCliente() {
        if(appCliente == null){
            appCliente = new Cliente();
        }
        return appCliente;
    }
    
    
    
    public void iniciar(){
        
        try {
            getAppCliente().conectar();
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
