/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_493;

import javax.swing.JOptionPane;
/**
 *
 * @author HUGO
 */
public class Atividade_493 {

    public static void main(String[] args) {
        String n;
        int x, op, num[] = new int[10];
        
        Verificacao veri = new Verificacao();
        
        for(x=0; x<10; x++){
            n = JOptionPane.showInputDialog("Digite o Numero["+(x+1)+"]");
            num[x] = Integer.parseInt(n);
        }
        
        op = veri.verifica(num, 10);
        
        System.out.println("=================================");
        for(x=0; x<10; x++){
            System.out.println("Numero["+(x+1)+"]: "+num[x]);
        }
        
        switch(op){
            case 1:
                System.out.println("--> ORDENACAO CRESCENTE");
                
                break;
            case 2:
                System.out.println("--> ORDENACAO DECRESCENTE");
                break;
                
            default:
                System.out.println("--> NAO ORDENADA");
        }
        System.out.println("=============================");
    }
}
