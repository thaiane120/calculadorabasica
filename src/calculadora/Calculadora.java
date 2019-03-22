/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Thaiane
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();
        int x, y, z;
        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Insira 1 caso queira somar\n Insira 2 caso queira subtrair\n Insira 3 caso queira multiplicar\n Insira 4 caso queira dividir\n Insira 5 caso queira fazer porcentagem"));
        if(z==1){
            System.out.println("O resultado é "+operacoes.somar(x, y));
        }else{
            if(z==2){
                System.out.println("O resultado é "+operacoes.subtrair(x, y));
            }else{
                if(z==3){
                    System.out.println("O resultado é "+operacoes.multiplicar(x, y));
                }else{
                    if(z==4){
                       System.out.println("O resultado é "+operacoes.dividir(x, y));
                    }else{
                        if(z==5){
                            System.out.println("O resultado é "+operacoes.porcent(x, y));
                        }
                        System.out.println("Operação inválida");
                    }
                }
            }
        }
    }
    
}
