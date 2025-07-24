/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lba.arbolbinario;

import java.util.Scanner;

public class PilaN {
      private int MAX=100;
    private Nodo_A v[]= new Nodo_A[MAX];
    private int tope;
    
    Scanner s= new Scanner(System.in);
    
    public PilaN(){
        tope=0;
    }
    public boolean esVacia(){
        if(tope==0){
            return(true);
        }else{
            return(false);
        }
    }
    
    public boolean esLlena(){
        if(tope==MAX){
            return(true);
        }else{
            return(false);
        }
    }
    
  
    
    public void adicionar(Nodo_A e){
        
        if(this.esLlena()){
            System.out.println("Pila llena");
        }else{
            tope++;
            v[tope]=e;
        }
    }
    
    public Nodo_A eliminar(){
        Nodo_A e = new Nodo_A();
        if(!this.esVacia()){
            e=v[tope];
            tope=tope-1;
        }else{
            System.out.println("Pila vacia");
        }
        return(e);
    }
    
    public void leer(int n){
        int i;
       
        for(i=1;i<=n;i++){
            //System.out.println("Elemento?");
            Nodo_A m=new Nodo_A();
            System.out.println("Introduzca un dato");
            int d=s.nextInt();
            m.setDato(d);
            adicionar(m);
        }
    }
        
    public void mostrar(){
        Nodo_A f;
        PilaN aux=new PilaN();
        while(!esVacia()){
            f = eliminar();
            System.out.println(f.getDato());
            aux.adicionar(f);
        }
        this.vaciar(aux);
    } 
     
    public int nroElem(){
        return(tope);
    }
      
    public void vaciar(PilaN p){
        while(!p.esVacia()){
            adicionar(p.eliminar());  
        }
    }
}
