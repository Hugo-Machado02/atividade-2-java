/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_494;

/**
 *
 * @author HUGO
 */
public class Alteracao_Nome {
    String aux;
    
    String troca(String str1, String str2){
        aux = str1;
        str1 = str2;
        str2 = aux;
    }
}
