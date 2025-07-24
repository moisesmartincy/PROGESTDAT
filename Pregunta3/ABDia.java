/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

import java.util.Scanner;

public class ABDia extends ArbolDia {
    Scanner s = new Scanner(System.in);

    public ABDia() {
        super();
    }

    // This method will create a predefined tree with only left descendants
    // for a specified number of NodoDia, as per the requirement (3 NodoDia)
    public void crearPredisenadoSoloIzquierda(int numNodes) {
        insertarNodosSoloIzquierda(numNodes);
    }
}