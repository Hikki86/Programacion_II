package pc1;

import javax.swing.JOptionPane;

public class ejercicio14 {
    public static void main(String[]args){
        int opc;
        E14 metodo = new E14();
        
        metodo.datos();
        
        do {                
            opc=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n1. Determinar la suma de las edades.\n2. Mostrar la edad maxima.\n3. Mostrar la edad minima.\n4. Promedio de edades.\n5. Finalizar."));
            switch(opc){
                case 1: 
                    metodo.suma();
                    break;
                    
                case 2:
                    metodo.maximo();
                    break;
                    
                case 3:
                      metodo.minimo();
                    break;
                
                case 4:
                    metodo.promedio();
                    break;
                    
            }
        }while(5!=opc);
    }
}    

