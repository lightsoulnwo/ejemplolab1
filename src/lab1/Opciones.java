/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author the-k
 */
public class Opciones {
    
    
    
    public Opciones(){}
        
    public void primo(double num){
        
        
          double c=num-1;
        while(num%c!=0){
        c--;
        
        }
        if(c==1){
        System.out.println("es primo el numero : "+ num);
        
        }else{
        System.out.println("no es primo el numero :"+num);
        }
        
    }
  
}
