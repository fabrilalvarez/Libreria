/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intel;

import javax.swing.JOptionPane;

/**
 *
 * @author fabrilalvarez
 */
public class Impresora {

    static int opcion;

    public static void Imprimir1() {
        /*
         Imprime por pantalla
        
         */
        do {
            int option = Integer.parseInt(JOptionPane.showInputDialog("0 Para JOptionpane // 1 Para Consola"));
            if (option==0) {
                JOptionPane.showMessageDialog(null, "asd");
            }
            if (option==1) {
                System.out.println("Seijas eres un petardo");
            }
        } while (opcion == 0);

    }

    public static void Imprimir2() {
        opcion = JOptionPane.showConfirmDialog(null, "¿Imprimir otra vez?");
    }

}
