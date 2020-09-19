package recursividad4;
import javax.swing.JOptionPane;
public class Recursividad4 {
public static void main(String[] args) {
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero :"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero : "));
      
        Tarea4 cuatro = new Tarea4();
        cuatro.MCD(n1, n2);    
    }
}
