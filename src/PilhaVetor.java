/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PilhaVetor <T> implements Pilha<T>{
    
    private int n;
    private int tam;
    private T [] vet;

    @Override
    public void push(T valor) {
        if (this.n< vet.length-1) {
        this.vet[++n] = valor;
            
        }
        throw new IllegalArgumentException("Pilha cheia");
    }

    @Override
    public T pop() {
if (vazia()){
    throw new IllegalArgumentException("Pilha Vazia");
}
return (this.vet[this.n--]);
    }

    @Override
    public T peek() {
        if (vazia()){
    throw new IllegalArgumentException("Pilha Vazia");
    }
        return (this.vet[this.n]);
    }

    @Override
    public boolean vazia() {    
        return (this.n  == 0);  
    }

    @Override
    public void libera() {
    }
    @Override
    public String toString(){
       return ""; 
    }
}
