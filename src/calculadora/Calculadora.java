package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Calculadora {
    
    private Pilha.PilhaLista pl;
    private Pilha.PilhaVetor pv;
    private float exp1,exp2;
    private char c;
    private String ex;
    
    
  
    
    public void listaVetor(){
 for (int i=0; i<ex.length(); i++) {
              c = ex.charAt(i);
              if (Character.isDigit(c))
                  pv.push(Character.digit(c,10));            
               else if(c=='+') {
                  exp1 = (float) pv.pop();
                  exp2 =  (float) pv.pop();
                  pv.push(exp1+exp2);
              }
              else if(c=='*') {
                exp1 = (float) pv.pop();
                  exp2 =  (float) pv.pop();
                  pv.push(exp1*exp2);
              }
              else if(c=='-') {
                 exp1 = (float) pv.pop();
                  exp2 =  (float) pv.pop();
                  pv.push(exp1-exp2);
              }
              else if(c=='/') {
               exp1 = (float) pv.pop();
                  exp2 =  (float) pv.pop();
                  pv.push(exp1/exp2);
              }  
          }
         System.out.println("Resposta = " + pv.peek());   
         pv.libera();
         
    }
    public void listaD (){
    for (int i=0; i<ex.length(); i++) {
              c = ex.charAt(i);
              if (Character.isDigit(c))
                  pl.push(Character.digit(c,10));
               else if(c=='+') {
                  exp1 = (float) pl.pop();
                  exp2 =  (float) pl.pop();
                  pl.push(exp1+exp2);
              }
              else if(c=='*') {
                exp1 = (float) pl.pop();
                  exp2 =  (float) pl.pop();
                  pl.push(exp1*exp2);
              }
              else if(c=='-') {
                 exp1 = (float) pl.pop();
                  exp2 =  (float) pl.pop();
                  pl.push(exp1-exp2);
              }
              else if(c=='/') {
               exp1 = (float) pl.pop();
                  exp2 =  (float) pl.pop();
                  pl.push(exp1/exp2);
              }
          }
         System.out.println("Resposta = " + pl.peek()); 
           pv.libera();
         
    }
}


    
