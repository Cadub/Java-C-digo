/import java.util.Scanner;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class ExemploRepeticao {
    static public void main (String[] args){
    /* int contador = 1;

    while (contador <= 10 ) {
    double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Forneca a primeira nota"));
    double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Forneca a segunda nota"));
    JOptionPane.showMessageDialog(null, "Media: " +  (nota1 + nota2)/ 2);
    }
    contador = contador + 1;
    */
    //UTILIZANDO O SCANNER
    /*
    Scanner leitor;
    leitor = new Scanner(System.in);
    int contador = 1;
    //while (contador++ <= 2) Compração ocorre primeiro
    while (contador <= 2) {
        System.out.println("Digite a primeira nota");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = leitor.nextDouble();
        System.out.printf("Media: %.2f\n", + (nota1 + nota2)/2);
        //contador = contador + 1
        //contador += 1;
        //contador++;
        ++contador;
    } 
    leitor.close();
    */
    //UTILIZANDO O FOR
    /*int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
    double nota1, nota2;
    //O for pode ser escrito for( ; ; ) tendo uma repetição infinita
    for(int contador = 1;contador <= 5;contador++) {
        System.out.println(contador);
    }
    */
    //Utilizando o DO/WHILE
    int op;
    do {
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua opcao"));
    } while(op != 1 && op != 2 && op != 3);
    JOptionPane.showMessageDialog(null, "Ok, opcao valida");
    }
}
    

