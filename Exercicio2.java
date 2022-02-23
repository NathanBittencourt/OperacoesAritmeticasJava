package operacoes;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        float r = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do raio: "));
    
        // Cria um objeto da classe AreaCirculo
        AreaCirculo ac = new AreaCirculo(r);

        // Exibe na tela o valor do cálculo
        JOptionPane.showMessageDialog(null, String.format("A Área do Círculo é %.2f", ac.Calcule()));
    } 
}
