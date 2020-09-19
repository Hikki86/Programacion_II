package recursividad6;
import javax.swing.JOptionPane;
public class Tarea6 {
    public void menorvec(int arreglo[], int n, int menor) {
        menor=arreglo[0];
        for(int i=0; i<n; i++){
            if(arreglo[i]<menor){
                menor=arreglo[i];
            }
        }
        JOptionPane.showMessageDialog(null,"El menor numero del Vector: "+menor);
    }
}
