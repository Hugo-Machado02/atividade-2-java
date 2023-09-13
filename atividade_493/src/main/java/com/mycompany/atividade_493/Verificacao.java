/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_493;

/**
 *
 * @author HUGO
 */
public class Verificacao {
    
    int busca1(int[] vetor, int tam){
        int x, y;
        
        for(x=0; x<tam-1; x++){
            if(vetor[x] < vetor[x+1]){
                y = 0;
                return y;
            }
        }
        y=1;
        return y;
    }
    
    int busca2(int[] vetor, int tam){
        int x, y;
        
        for(x=0; x<tam-1; x++){
            if(vetor[x] > vetor[x+1]){
                y = 0;
                return y;
            }
        }
        y=1;
        return y;
    }
    
    int verifica(int[] vetores, int t){
        int operador, result;
        
        operador = busca1(vetores, t);
        
        if(operador == 1){
            result = 2;
            return result;
        }
        else{
            operador = busca2(vetores, t);
            if(operador == 1){
                result = 1;
                return result;
            }
            else{
                result = 0;
                return result;
            }
        }
    }
}
