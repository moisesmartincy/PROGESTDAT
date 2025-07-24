/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author HP
 */
public class Pregunta3 {

    public static void main(String[] args) {
        // Create an ABTotal instance, which is our main tree for NodoTotal
        ABTotal arbolPrincipal = new ABTotal();

        // Call the specific method to create the pre-designed structure for sol1
        arbolPrincipal.crearPredisenadoSol1();

        System.out.println("\n--- Recorrido Inorden del ArbolTotal (mostrando ArbolDia de cada NodoTotal) ---");
        arbolPrincipal.inorden();

        System.out.println("\n--- Recorrido por Niveles del ArbolTotal (mostrando ArbolDia de cada NodoTotal) ---");
        arbolPrincipal.recorridoNiveles();

        System.out.println("\nNúmero total de NodoTotal en el árbol principal: " + arbolPrincipal.nroElems());
    }
}