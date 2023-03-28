package presentacion;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Servidor;

public class Modelo {

    private Servidor appServidor;
    
    public Modelo() {
        
        new VistaPrincipal().setVisible(true);
        
    }

    public Servidor getAppServidor() {
        if(appServidor == null){
            appServidor = new Servidor();
        }
        return appServidor;
    }
    
    
    public void iniciar(){
        getAppServidor().activar(true);
        try {
            getAppServidor().escucharClientes();
        } catch (IOException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAppServidor().activar(false);        
    }
}
