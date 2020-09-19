package recursividad3;

import javax.swing.JOptionPane;

public class Tarea3 {     
    public void Sumavector(int arreglo[], int n, int suma) {
        for(int i=0; i<n; i++){
            suma=suma+arreglo[i];
        }
        JOptionPane.showMessageDialog(null,suma);
    }
}

    

