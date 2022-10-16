/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Tarea 6: Obtener el nombre mas largo de tres personas
*/

import javax.swing.*;

public class NombreMasLargo {

    public static void main(String[] args) {
        String nom1 = JOptionPane.showInputDialog("Ingrese el primer nombre completo");
        String nom2 = JOptionPane.showInputDialog("Ingrese el segundo nombre completo");
        String nom3 = JOptionPane.showInputDialog("Ingrese el tercer nombre completo");
        String masLargo = "";

        masLargo = (nom1.split(" ")[0].length() >= nom2.split(" ")[0].length()) ? nom1 : nom2;
        masLargo = (masLargo.split(" ")[0].length() >= nom3.split(" ")[0].length()) ? masLargo : nom3;

        System.out.println(masLargo + " tiene el nombre más largo");
    }

}
