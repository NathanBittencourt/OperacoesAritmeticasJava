/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Professional
 */
public class Exercicio1 {
    public static void main(String[] args) {
        float v1 = Float.parseFloat (
            JOptionPane.showInputDialog("Informe um valor: "));
        
        float v2 = Float.parseFloat (
            JOptionPane.showInputDialog("Informe outro valor: "));
        
        // Cria um objeto da classe OperacoesAritmeticas
        OperacoesAritmeticas OP = new OperacoesAritmeticas(v1,v2);
        
        //Exibe a soma:
        JOptionPane.showMessageDialog(null, "A soma é " + OP.adicionar());
        
        //Exibe a subtração:
        JOptionPane.showMessageDialog(null, "A subtração é " + OP.subtrair());
        
        //Exibe a multiplicação:
        JOptionPane.showMessageDialog(null, "A multiplicação é " + OP.multiplicar());
        
        //Exibe a divisão:
        JOptionPane.showMessageDialog(null, "A divisão é " + OP.dividir());

    }
}
