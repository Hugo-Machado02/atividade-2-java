/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_487;

import javax.swing.JOptionPane;

/**
 *
 * @author HUGO
 */
public class Atividade_487 {

    public static void main(String[] args) {
        String n;
        int x, i, aux, num[] = new int[10];
        
        Inverter inv = new Inverter();
        
        for(x=0; x<10; x++){
            n = JOptionPane.showInputDialog("Digite o Valor da posicao ["+(x+1)+"]");
            num[x] = Integer.parseInt(n);
        }
        
        System.out.println("\n\n======= Vetores Normais =======");  
        for(x=0; x<10; x++){
            System.out.println((x+1)+" -> "+num[x]);
        }
        System.out.println("===============================");
        
        System.out.println("\n\n====== Vetores Invertidos =====");        
        inv.inverter_Numeros(num, 10);
        System.out.println("===============================");
    }
}
