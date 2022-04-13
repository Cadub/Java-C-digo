import javax.swing.JOptionPane;

public class Salario {
    static public void main (String [] args ) {
    
    int salario_fixo, comissão_fixa_para_cada_venda, quantidade_de_carro_vendido, valor_da_venda;
    double salario_final;

    salario_fixo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Salario"));
    comissão_fixa_para_cada_venda = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Comissao fixa"));
    quantidade_de_carro_vendido = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de carros vendidos"));
    valor_da_venda = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da venda de um carro"));

    salario_final= salario_fixo + comissão_fixa_para_cada_venda*quantidade_de_carro_vendido + (((valor_da_venda*quantidade_de_carro_vendido)*0.05) + valor_da_venda*quantidade_de_carro_vendido);

    JOptionPane.showMessageDialog(null, salario_final);

    }
    
}
