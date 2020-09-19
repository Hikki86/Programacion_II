package recursividad3;
import javax.swing.JOptionPane;
public class Recursividad3 {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quiere ingresar :  "));
        int arreglo[];
        int suma=0;
        arreglo = new int[n];
        
        JOptionPane.showMessageDialog(null,"LOS VALORES SON");
        
        for (int i = 0; i < n; i++) {
            arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("V ["+i+"]"));
        }
        Tarea3 sumaarreglo = new Tarea3();   
        sumaarreglo.Sumavector(arreglo, n,suma);
    }
    
}
