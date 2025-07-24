/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimple;

/**
 *
 * @author HP
 */
// ListaSimple.java
import java.util.Scanner;

public class ListaSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa el numero de nodos de la lista 1:");
        int n1 = scanner.nextInt();
        ListaN lista1 = new ListaN();
        lista1.leer2(n1);

        System.out.println("ingresa el numero de nodos de la lista 2:");
        int n2 = scanner.nextInt();
        ListaN lista2 = new ListaN();
        lista2.leer2(n2);

        System.out.println("\nLista 1:");
        lista1.mostrar();
        System.out.println("Lista 2:");
        lista2.mostrar();

        int count1 = lista1.countNodesRecursive();
        int count2 = lista2.countNodesRecursive();

        System.out.println("\nNumero de nodos en la lista 1: " + count1);
        System.out.println("Numero de nodos en la lista 2: " + count2);

        if (count1 == count2) {
            System.out.println("son iguales");
        } else {
            System.out.println("no son iguales");
        }

        scanner.close();
    }
}