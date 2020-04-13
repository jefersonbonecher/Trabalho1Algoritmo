package Pilha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PilhaLista<T> implements Pilha<T>{
   
    
    private ElementoLista<T> topo;

    @Override
    public void push(T valor) {
        ElementoLista<T> novo = new ElementoLista<>();
        novo.setInfo(valor);
        if (this.vazia()){
            topo = novo;
        }else{
            topo=topo.getProx();
        }
    }

    @Override
    public T pop() {       
        if (this.vazia()){
            throw new IllegalArgumentException("Pilha vazia");    
        }   
        T item = topo.getInfo();
        topo = topo.getProx();

        return item;
    
    }

    @Override
    public T peek() {
         if (vazia()){
    throw new IllegalArgumentException("Pilha Vazia");
    }
         return topo.getInfo();
    }

    @Override
    public boolean vazia() {
       return topo==null;
    }

    @Override
    public void libera() {
               while (topo != null){
                   topo.getProx();
                   topo = null; 
               } 
               } 
    public String toString(){
        String resultado ="";
       while (topo != null){
           resultado = resultado + topo.getInfo() +" ";
       }     
       return resultado ; 
    }
}
              