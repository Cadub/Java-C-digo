import javax.swing.JOptionPane;

public class LeitorDePalavras{
    public static void main(String[] args){
      /*String frase = "Java é muito interessante";
       
      // vamos obter o tamanho da string
      int tam = frase.length();
       
      // e mostramos o resultado
      System.out.println("Esta string contem " + 
        tam + " caracteres");
       
      System.exit(0);*/
      String frase = JOptionPane.showInputDialog("Digite um frase aleatória");
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de a"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de b"));

      JOptionPane.showMessageDialog(null, "Sua string entre as valores de a e b fica: " + frase.substring(a,b));
    }
 }
