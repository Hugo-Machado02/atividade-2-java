/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_487;

/**
 *
 * @author HUGO
 */
public class Inverter {
    int x, i, aux;
    
    void inverter_Numeros(int[] vetores, int max){
        i = max;
        for(x=0; x<max/2; x++){
            i--;       
            aux = vetores[i];
            vetores[i] = vetores[x];
            vetores[x] = aux;
        }
        for(x=0; x<max; x++){
            System.out.println((x+1)+" -> "+vetores[x]);
        }
        
    }
}
