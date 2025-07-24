/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lba.arbolbinario;

/**
 *
 * @author Asus
 */
public class Arbol {
    private Nodo_A r;
    public Arbol(){
        r=null;
    }
    public Nodo_A getR() {
        return r;
    }

    public void setR(Nodo_A r) {
        this.r = r;
    }
    
    
    boolean esVacia(){
        if(r==null){
            return true;
        }
        return false;
    }
    
    
    
    void inorden(){
        Nodo_A x=new Nodo_A();
        PilaN p=new PilaN();
        p.adicionar(null);
        x=getR();
        while(!p.esVacia()){
            while(x!=null){
                p.adicionar(x);
                x=x.getIzq();
            }
            x=p.eliminar();
            if(x!=null ){
                System.out.println(x.getDato());
                x=x.getDer();
            }
        }
    }
    void recorridoNiveles(){
        PilaN p=new PilaN();
        PilaN aux=new PilaN();
        p.adicionar(getR());
        while(!p.esVacia()){
            System.out.println("");
            while(!p.esVacia()){
                Nodo_A x=new Nodo_A();
                        x=p.eliminar();
                System.out.print(" "+x.getDato()+"   ");
                if(x.getIzq()!=null){
                    aux.adicionar(x.getIzq());
                }
                if(x.getDer()!=null){
                aux.adicionar(x.getDer());
                }
            }
            p.vaciar(aux);
        }
    }
    void hojas(){
        PilaN p=new PilaN();
        PilaN aux=new PilaN();
        p.adicionar(getR());
        while(!p.esVacia()){
            System.out.println("");
            while(!p.esVacia()){
                Nodo_A x=new Nodo_A();
                        x=p.eliminar();
                        if(x.getDer()!=null && x.getIzq()!=null){
                            System.out.print(" "+x.getDato()+"   ");
                        }
                        if(x.getDer()!=null &&x.getIzq()==null){
                            System.out.print(" "+x.getDato()+"   ");
                        }
                        if(x.getDer()==null &&x.getIzq()!=null){
                            System.out.print(" "+x.getDato()+"   ");
                        }
                
                if(x.getIzq()!=null){
                    aux.adicionar(x.getIzq());
                }
                if(x.getDer()!=null){
                aux.adicionar(x.getDer());
                }
            }
            p.vaciar(aux);
        }
    }
    int nroElems(){
        int c=0;
        PilaN p=new PilaN();
        PilaN aux=new PilaN();
        p.adicionar(getR());
        while(!p.esVacia()){
            System.out.println("");
            
            while(!p.esVacia()){
                Nodo_A x=new Nodo_A();
                        x=p.eliminar();
                        c++;
                if(x.getIzq()!=null){
                    aux.adicionar(x.getIzq());
                }
                if(x.getDer()!=null){
                aux.adicionar(x.getDer());
                }
            }
            p.vaciar(aux);
        }
        return c;
    }
    
    
}
