package recursividad6;
import javax.swing.JOptionPane;
public class Recursividad6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros quiere ingresar :  "));
        int arreglo[];
        int menor=0;
        arreglo = new int[n];
        
        JOptionPane.showMessageDialog(null,"LOS VALORES SON");
        
        for (int i = 0; i < n; i++) {
            arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog("V ["+i+"]"));
        }
        Tarea6 seis = new Tarea6();      
        seis.menorvec(arreglo, n, menor);
    }
}
