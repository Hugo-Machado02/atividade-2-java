/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_497;

/**
 *
 * @author ELAINE
 */
public class Ordenacao {
    int numeros[] = new int[10];
    
    void ordenar(int[] vetor, int tam){
        int x, y, aux;
        
        for(x=0; x<tam-1; x++){
            for(y=x+1; y<tam; y++){
                if(vetor[x] > vetor[y]){
                    aux = vetor[x];
                    vetor[x] = vetor[y];
                    vetor[y] = aux;
                }
            }
        }
        for(x=0; x<tam; x++){
            numeros[x] = vetor[x];
        }
    }
    
    int buscar(int tam, int chave){
        int x, inicio, meio, fim;
        
        inicio = 0;
        fim = tam-1;
        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(chave == numeros[meio]){
                return(meio);
            }
            else{
                if(chave < numeros[meio]){
                    fim = meio-1;
                }
                else{
                    inicio = meio+1;
                }
            }
        }
        meio = (-1);
        return meio;
    }
}
