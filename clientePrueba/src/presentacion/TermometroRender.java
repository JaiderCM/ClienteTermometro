/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class TermometroRender extends JPanel{
    
    int intervaloMenor, intervaloMayor, intervaloInicial;
    
    
    public TermometroRender(){
        Scanner sc = new Scanner(System.in);
        JSlider control = new JSlider(SwingConstants.VERTICAL, intervaloMenor, intervaloMayor, intervaloInicial);
        
        System.out.println("Ingrese los intervalos del termómetro");
        System.out.println("intervalo menor: ");
        intervaloMenor = sc.nextInt();
        
    }
    
}
