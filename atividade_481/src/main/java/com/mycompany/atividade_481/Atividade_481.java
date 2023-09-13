/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_481;

import javax.swing.JOptionPane;

/**
 *
 * @author HUGO
 */
public class Atividade_481 {

    public static void main(String[] args) {
        String n, b;
        int num, base, resultado;
        
        Converter con = new Converter();
        
        n = JOptionPane.showInputDialog("Digite um número Maior ou igual a 0");
        num = Integer.parseInt(n);
        
        while(num < 0){
            n = JOptionPane.showInputDialog("Numero não aceito! Digite novamente um número Maior ou igual a 0");
            num = Integer.parseInt(n);
        }
        
        b = JOptionPane.showInputDialog("Digite a base de conversao -> (2-10)");
        base = Integer.parseInt(b);
        
        while(base < 2 || base > 10){
            n = JOptionPane.showInputDialog("base não aceita! Digite novamente a base de conversao -> (2-10)");
            num = Integer.parseInt(n);
        }
        
        resultado = con.conversao(num, base);
        
        System.out.println("============ CONVERSAO ============");
        System.out.println("numero Decimal = "+num);
        System.out.println("numero na base "+base+" = "+resultado);
        System.out.println("===================================");
        
        //IMprmir o resultado;       
        
    }
}
