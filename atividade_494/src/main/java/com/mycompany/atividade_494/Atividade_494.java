/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_494;

import javax.swing.JOptionPane;

/**
 *
 * @author HUGO
 */
public class Atividade_494 {

    public static void main(String[] args) {
        String nome[] = new String[3], prof[] = new String[3], end[] = new String[3];
        int x, i;
        
        Alteracao_Nome alt = new Alteracao_Nome();
        
        for(x=0; x<3; x++){
            nome[x] = JOptionPane.showInputDialog("Digite o Nome da pessoa ["+(x+1)+"]");
            prof[x] = JOptionPane.showInputDialog("Digite a Profissao da pessoa ["+(x+1)+"]");
            end[x] = JOptionPane.showInputDialog("Digite o Endereco da pessoa ["+(x+1)+"]");
        }
        
        for(x=0; x<3; x++){
            for(i=x+1; i<3; i++){
                if(nome[x].length() > nome[i].length()){
                   alt.troca(nome[x], nome[i]);
                }
            }
        }
    }
}
