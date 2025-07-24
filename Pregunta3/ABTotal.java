/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

import java.util.Scanner;

public class ABTotal extends ArbolTotal {
    Scanner s = new Scanner(System.in);

    public ABTotal() {
        super();
    }

    // This method will create the pre-designed structure:
    // 3 NodoTotal, each with only left descendants, and each containing
    // an ABDia that also has 3 NodoDia only on its left side.
    public void crearPredisenadoSol1() {
        // We will create 3 NodoTotal nodes and link them as left children
        // of each other, starting from the root.
        
        // Root NodoTotal
        NodoTotal rootNode = new NodoTotal();
        rootNode.setId(1); // Identifier for the first NodoTotal
        rootNode.getAb().crearPredisenadoSoloIzquierda(3); // 3 NodoDia for the first month
        setR(rootNode); // Set this as the root of ABTotal

        // Second NodoTotal (left child of the first)
        NodoTotal secondNode = new NodoTotal();
        secondNode.setId(2); // Identifier for the second NodoTotal
        secondNode.getAb().crearPredisenadoSoloIzquierda(3); // 3 NodoDia for the second month
        rootNode.setIzq(secondNode); // Link as left child

        // Third NodoTotal (left child of the second)
        NodoTotal thirdNode = new NodoTotal();
        thirdNode.setId(3); // Identifier for the third NodoTotal
        thirdNode.getAb().crearPredisenadoSoloIzquierda(3); // 3 NodoDia for the third month
        secondNode.setIzq(thirdNode); // Link as left child

        System.out.println("Estructura pre-diseñada de 3 NodoTotal (solo a la izquierda) creada exitosamente.");
        System.out.println("Cada NodoTotal contiene un ArbolDia con 3 NodoDia (solo a la izquierda).");
    }
}