/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Thaiane
 */
public class Operacoes {
    float soma;
    float subtracao;
    float multiplicacao;
    float divisao;
    
    public float somar(float x, float y){
        this.soma=x+y;
        return this.soma;
}
    
    public float subtrair(float x, float y){
        this.subtracao=x-y;
        return this.subtracao;
}
    
    public float multiplicar(float x, float y){
        this.multiplicacao=x*y;
        return this.multiplicacao;
}
    
    public float dividir(float x, float y){
        this.divisao=x/y;
        return this.divisao;
}
}
