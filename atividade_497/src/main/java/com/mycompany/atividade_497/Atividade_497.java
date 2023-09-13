/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_497;

import javax.swing.JOptionPane;

/**
 *
 * @author HUGO
 */
public class Atividade_497 {

    public static void main(String[] args) {
        String n, b;
        int x, aux, buscar, v_busca, num[] = new int[10];
        
        Ordenacao ord = new Ordenacao();
        
        for(x=0; x<10; x++){
            n = JOptionPane.showInputDialog("Digite um Numero["+(x+1)+"]");       
            num[x] = Integer.parseInt(n);
        }
        b = JOptionPane.showInputDialog("Digite o numero que deseja buscar");  
        buscar = Integer.parseInt(b);
        
        ord.ordenar(num, 10);
        v_busca = ord.buscar(10, buscar);
        v_busca++;
        
        System.out.println("========== VETOR ==========");
        for(x=0; x<10; x++){
            num[x] = ord.numeros[x];
            System.out.println((x+1)+" - "+num[x]);
        }
        
        if(v_busca != 0){
            System.out.println("Posicao do vetor: "+v_busca);
        }else{
            System.out.print("\nNumero '"+buscar+"' Não encontrado!\n");
        }
        System.out.println("===========================\n\n");
    }
}
