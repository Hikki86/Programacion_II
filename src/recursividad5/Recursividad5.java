package recursividad5;
import javax.swing.JOptionPane;

public class Recursividad5 {
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
        boolean EsimPar = impar(n);

        if (EsimPar == true) {
            JOptionPane.showMessageDialog(null, "El numero es impar ");
        }
        if (EsimPar == false) {
            JOptionPane.showMessageDialog(null, "El numero es par ");
        }
    }
    public static boolean impar(int n) {
        if (n == 0) {
            return false;
        }else{
            return par(n - 1);
        }
    }
    public static boolean par(int n) {
        if (n == 0) {
            return true;
        }else{
            return impar(n - 1);
        }       
}
}
