/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_483;

import javax.swing.JOptionPane;
/**
 *
 * @author HUGO
 */
public class Atividade_483 {

    public static void main(String[] args) {
        String buscValor;
        int x, resultado, num1[] = new int[4], num2[] = new int[4];
        
        Calculo calc = new Calculo();
        
        for(x = 0; x<4; x++){
            buscValor = JOptionPane.showInputDialog("Digite um numero para o 1º vetor["+(x+1)+"]");
            num1[x] = Integer.parseInt(buscValor);
        }
        
        for(x = 0; x<4; x++){
            buscValor = JOptionPane.showInputDialog("Digite um numero para o 2º vetor["+(x+1)+"]");
            num2[x] = Integer.parseInt(buscValor);
        }
        resultado = calc.produto_interno(num1, num2, 4);
        
        System.out.print("\n\n==============================\n");
        System.out.println("Vetor A \t Vetor B");
        for(x = 0; x<4; x++){
            System.out.println(num1[x]+" \t\t "+num2[x]);
        }
        System.out.print("\nProduto interno: "+resultado);
        System.out.print("\n==============================\n\n");
    }
}
