/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_481;


/**
 *
 * @author HUGO
 */
public class Converter {
    int b, r;
    double calc;
    
   int conversao(int nnum, int nbase){
       b = 0;
       calc = 0;
       while(nnum >= nbase){
           r = nnum % nbase;
           calc = calc + (Math.pow(10, b)) * r;
           nnum = nnum / nbase;
           b++;
       }
       calc = calc + (Math.pow(10, b)) * nnum;
       int resp = (int) calc;
       return resp;
   }
    
}
