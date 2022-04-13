import javax.swing.JOptionPane;

public class Senha {
    static public void main (String [] aStrings) {
        
        JOptionPane.showMessageDialog(null, "Requisitos para sua senha: ");
        JOptionPane.showMessageDialog(null, "Ela deve apresentar 4 Digitos");
        JOptionPane.showMessageDialog(null, "O primeiro Símbolo dever ser igual 'A' ou  'a' ");
        JOptionPane.showMessageDialog(null, "Apresenta pelo menos um número impar, Fim dos Requisitos");

        String senha = JOptionPane.showInputDialog("Digite a sua Senha");
        
        if (senha.length() != 4) {
            JOptionPane.showMessageDialog(null, "Erro: Sua senha precisa ter 4 digitos"); }
    
        else {
            if (senha.charAt(0) == "A"|| senha.charAt(0) == "a" ) {
               if (senha.contains("1") || senha.contains("3") || senha.contains("5") || senha.contains("7") || senha.contains("9")) {
                   JOptionPane.showMessageDialog(null, "Essa senha é valida");
               }
               else {
                   JOptionPane.showMessageDialog(null, "ERRO: Essa senha deve conter pelo menos um numero impar");
               }
               
            }
            else {
                JOptionPane.showMessageDialog(null, "ERRO: Essa senha deve começar com 'A' ou 'a'");
            }

        }
    }
}
