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
public class ElementoLista <T>{
    

        private T info;
	private ElementoLista<T> prox;
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public ElementoLista<T> getProx() {
		return prox;
	}
	public void setProx(ElementoLista<T> prox) {
		this.prox = prox;
	}
        public String toString(){
            return null;
            
        }
}
