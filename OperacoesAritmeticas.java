/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

/**
 *
 * @author Professional
 */
public class OperacoesAritmeticas {
    private float valor1; // Atributos
    private float valor2;
    
    //Método Construtor
    public OperacoesAritmeticas(float v1, float v2){
        this.valor1 = v1;
        this.valor2 = v2;
    }
    
    //Criando Métodos
    public float adicionar(){
        return this.valor1 + this.valor2;
    }
    public float subtrair() {
        return this.valor1 - this.valor2;
    }
    public float multiplicar() {
        return this.valor1 * this.valor2;
    }
    public float dividir() {
        return this.valor1 / this.valor2;
    }
}
