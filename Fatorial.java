import javax.swing.JOptionPane;

public class Fatorial {
    static public void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero que deseja calcular o fatorial"));
        double f = numero;
        while (numero > 1) {
            f = f*(numero - 1); numero--;
            //String fatorial = String.format("Dado o numero: %.0f; O valor de seu fatorial ficara: %.2f", numero, f);
            //JOptionPane.showMessageDialog(null, fatorial);
            System.out.println(f);
        }
        if (numero == 0) {
           JOptionPane.showMessageDialog(null, "O valor é 1");;
        }
        else if (numero <= 0) {
            JOptionPane.showMessageDialog(null, "O VALOR DO NUMERO DEVER SER IGUAL OU MAIOR QUE 0!");
        }
    }
    
}
