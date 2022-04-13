import javax.swing.JOptionPane;

public class OperadorTernario2 {
    static public void main(String [] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota"));
        String conceito;

        conceito = nota == 10 ? "A": nota >= 9 ? "A" : nota == 8 ? "B" : nota == 7 ? "C" : "Recuperacao Filha da mae";
        JOptionPane.showMessageDialog(null, conceito);
    }
    
}
