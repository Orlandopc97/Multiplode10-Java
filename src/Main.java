import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        //si el numero dividido entre 10 el residuo es 0 sera multiplo de 10
        if (numero%10 == 0){
            JOptionPane.showMessageDialog(null,"EL numero " + numero + " es multiplo de 10");
        }else {
            JOptionPane.showMessageDialog(null,"El  numero " + numero + " no es multiplo de 10");
        }
    }
}