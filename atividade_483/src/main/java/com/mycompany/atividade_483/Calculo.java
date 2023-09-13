/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_483;

/**
 *
 * @author HUGO
 */
public class Calculo {
    int i, res_final;
    
    int produto_interno(int[] vet1, int[] vet2, int qtd){
        res_final = 0;
        
        for(i = 0; i<qtd; i++){
            res_final = res_final + (vet1[i] * vet2[i]);
        }
        
        return res_final;
    }
    
}
