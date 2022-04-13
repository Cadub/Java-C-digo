import javax.swing.JOptionPane;

public class ConfigurandoNota2  {
    static public void main (String[] args){
    //Double é uma classe empacotadora (wrapper) referente ao primitivo double
       int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a Nota do Aluno"));

        switch (nota) {
            case 10:
                JOptionPane.showMessageDialog(null, "Parabens");
            case 9: 
                JOptionPane.showMessageDialog(null, "Nota A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Nota B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Nota C");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nota D");
                JOptionPane.showMessageDialog(null, "Se fudeu");
                break;
            
        }
        JOptionPane.showMessageDialog(null, "Até mais parça");
    }
}

