/*
3. Leer 2 números y determinar el mayor de ellos.
 */
package numeromayor03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class NumeroMayor03 {

    public static void main(String[] args) {
        int numeroA;
        int numeroB;

        try {
            numeroA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero 1"));
            numeroB = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero 2"));

            if (numeroA > numeroB) {
                JOptionPane.showMessageDialog(null, "El numero (A) : " + numeroA + " Es mayor ");
            }
            if (numeroB > numeroA) {
                JOptionPane.showMessageDialog(null, "El numero (B) : " + numeroB + " Es mayor ");
            } else if (numeroA == numeroB) {
                JOptionPane.showMessageDialog(null, "El numero (A) : " + numeroA + " y El numero (B) : " + numeroB + " Son iguales");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar el valor de  " + e);

        }

    }

}
