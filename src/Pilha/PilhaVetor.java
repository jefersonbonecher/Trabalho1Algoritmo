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
public class PilhaVetor <T> implements Pilha<T>{
    
    private int n;
    private int tam;
    private T [] vet;
    
    public PilhaVetor(int t){
      this.tam = tam;
      vet = (T[]) new Object[tam];
  }
    

    @Override
    public void push(T valor) {
        if (n == tam){
            throw new IllegalArgumentException("Pilha cheia");
        }else{
      this.vet[n++]= valor;
        }
        
        throw new IllegalArgumentException("Pilha cheia");
    }

    @Override
    public T pop() {
if (vazia()){
    throw new IllegalArgumentException("Pilha Vazia");
}
T res = this.vet[n - 1];
    this.vet[n - 1] = null;
    this.n--;

    return res;
  }

    

    @Override
    public T peek() {
        if (vazia()){
    throw new IllegalArgumentException("Pilha Vazia");
    }
        return (this.vet[n-1]);
    }

    @Override
    public boolean vazia() {    
        return (this.n  == 0);  
    }

    @Override
    public void libera() {
      this.n = 0;
    this.vet = (T[]) new Object[tam];
  }
    
    @Override
    public String toString(){    
        String resultado = "";

        for (int i = n - 1; i >= 0; i--) {
            resultado += vet[i] + "";
        }
        return resultado;
    }
    }