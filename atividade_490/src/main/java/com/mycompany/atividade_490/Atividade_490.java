/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_490;

import javax.swing.JOptionPane;
/**
 *
 * @author HUGO
 */
public class Atividade_490 {

    public static void main(String[] args) {
        String palavras[] = new String[10], pa_alter[] = new String[10];
        int x;
        
        Alteracao_String alt = new Alteracao_String();
        
        for(x=0; x<10; x++){
            palavras[x] = JOptionPane.showInputDialog("Digite uma palavra com letras minusculas - Palavra["+(x+1)+"]");
            
            pa_alter[x] = alt.alteracao(palavras[x], palavras[x].length(), "c");
        }
        
        System.out.println("================ Palavras Alteradas ================");
        for(x=0; x<10; x++){
            System.out.println((x+1)+" - "+palavras[x]);
        }
        System.out.print("\n====================================================\n\n\n");
        
        System.out.println("================ Palavras Digitadas ================");
        for(x=0; x<10; x++){
            System.out.println((x+1)+" - "+pa_alter[x]);
        }
        System.out.print("\n====================================================\n\n\n");
    }
}
