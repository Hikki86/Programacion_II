package pc1;
import javax.swing.JOptionPane;
public class ejercicio15 {
public static void main(String[]args){
    E15 metodo = new E15();
    int opc;
    
    metodo.datos();
    
    do{
        opc=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n1. Mostrar el primer caracter en mayuscula y el resto en minuscula.\n2. Calcular la cantidad de vocales de cada nombre.\n3. Mostrar el nombre mas largo.\n4. Salir."));
        switch(opc){
            case 1:
                metodo.mayuscula();
                break;
                
            case 2:
                metodo.vocal();
                break;
                
            case 3:
                metodo.mayor();
                break;
            
            case 4:
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
        }
    }while(opc!=4);
}    
}
