/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lba.arbolbinario;

import java.util.Scanner;


public class AB extends Arbol{
     Scanner s=new Scanner(System.in);
    public AB(){
        super();
    }
    void crear(){
        char resp;
        int d;
        PilaN p=new PilaN();
        Nodo_A x=new Nodo_A();
        System.out.println("Int dato caractern en la raiz: ");
        d=s.nextInt();
        x.setDato(d);
        p.adicionar(x);
        setR(x);
        while(!p.esVacia()){
            x=p.eliminar();
            System.out.println(x.getDato()+" tiene derecha? S/N");
            resp=s.next().charAt(0);
            if(resp=='s'){
                Nodo_A cd=new Nodo_A();
                System.out.println("Int dato caracter:");
                d=s.nextInt();
                cd.setDato(d);
                x.setDer(cd);
            }
            System.out.println(x.getDato()+" tiene izquierda? S/N");
            resp=s.next().charAt(0);
            if(resp=='s'){
                Nodo_A xi=new Nodo_A();
                System.out.println(" int dato caracter: ");
                d=s.nextInt();
                xi.setDato(d);
                x.setIzq(xi);
            }
            if(x.getDer()!=null){
                p.adicionar(x.getDer());
            }
            if(x.getIzq()!=null){
                p.adicionar(x.getIzq());
            }
        }
    }
}
