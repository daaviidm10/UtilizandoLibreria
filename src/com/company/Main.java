package com.company;
import Visualizar.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
            VisualizaConsola vc = new VisualizaConsola();
            vc.visualizar("Hola buenas");
            VisualizaVentana vv = new VisualizaVentana();
            vv.visualizar(JOptionPane.showInputDialog("Hola buenas"));
    }

}
