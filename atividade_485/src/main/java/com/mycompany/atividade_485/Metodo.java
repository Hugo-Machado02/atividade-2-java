/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_485;

/**
 *
 * @author HUGO
 */
public class Metodo {
    
    void multivetor(int[] numero, String[] Caractere, int tam){
        int x, y;
        
        for(x=0; x<tam; x++){
            System.out.println();
            for(y=0; y<numero[x]; y++){
                System.out.print(Caractere[x]);
            }
        }
        System.out.println();
    }
    
}
