
package restaurante;

import javax.swing.JProgressBar;
// este parte de codigo permite la animacion de la barra al momento de cargar la app
public class Cargar extends Thread {
    JProgressBar progreso;
    
    public Cargar(JProgressBar progreso){
        super();
        this.progreso = progreso; 
    }
    
    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            progreso.setValue(i);
            pausa(60);
        }
    }
    public void pausa(int mlSeg){
        try {
            Thread.sleep(mlSeg);
        }
        catch(Exception e){
            
        }
    }
}
