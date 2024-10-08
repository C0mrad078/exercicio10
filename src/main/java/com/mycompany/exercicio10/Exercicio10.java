/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio10;

/**
 *
 * @author Administrator
 */

import javax.swing.JOptionPane;
public class Exercicio10 {

    public static void main(String[] args) {
        int a,b,resultado;
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));
            resultado = a + b;
        if(resultado > 10){JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);}
        if(resultado < 10){JOptionPane.showMessageDialog(null,"Seu reultado e menor que 10");}
    }
}

