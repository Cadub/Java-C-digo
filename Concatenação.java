import javax.swing.JOptionPane;

public class Ex04 {
    static public void main (String [ ] args) {
        String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra");
        String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra");

        int tamanho1 = palavra1.length();
        int tamanho2 = palavra2.length();

        String conca = palavra1.concat(" ").concat(palavra2);

        JOptionPane.showMessageDialog(null, "Suas palavras são: " + conca + "; e elas tem tamanhos de: " + tamanho1 + " e " + tamanho2);
    }
}
