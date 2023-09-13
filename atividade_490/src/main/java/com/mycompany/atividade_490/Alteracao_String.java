/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_490;

/**
 *
 * @author HUGO
 */
public class Alteracao_String {
    int x;
    
    String alteracao(String palavra, int tam, String car){
        char letras[] = new char[tam];
        
        for(x=0; x<tam; x++){
            letras[x] = palavra.charAt(x);
            
            if(letras[x] == car.charAt(0)){
                letras[x] = '*';                
            }
        }
        
        String resultado = new String(letras);
        
        return resultado;
    }
}
