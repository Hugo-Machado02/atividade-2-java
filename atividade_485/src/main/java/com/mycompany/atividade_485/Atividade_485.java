/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_485;

import javax.swing.JOptionPane;

/**
 *
 * @author HUGO
 */
public class Atividade_485 {

    public static void main(String[] args) {
        String num, carac[] = new String[6];
        int x, val[] = new int[6];
        
        Metodo me = new Metodo();
        
        for(x=0; x<6; x++){
            num = JOptionPane.showInputDialog("Digite um numero["+(x+1)+"]");
            val[x] = Integer.parseInt(num);
        }
        for(x=0; x<6; x++){
            carac[x] = JOptionPane.showInputDialog("Digite um Caractere["+(x+1)+"]");
        }
        
        me.multivetor(val, carac, 6);
        
    }
}
