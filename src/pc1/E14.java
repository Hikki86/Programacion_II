package pc1;
import javax.swing.JOptionPane;
public class E14 {
    int cant;
    int suma=0;
    int max;
    int min;
    int promedio;
    int array[];
    
    public void datos(){
        cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de edades: "));
        array=new int[cant];
        
        for(int i=0;i<cant;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
        }
    }
    
    public void suma(){
        for(int i=0;i<cant;i++){
            suma+=array[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de edades es: "+suma);
    }
    
    public void maximo(){
        max=array[0];
        for(int i=0;i<cant;i++){                     
            if(max<array[i]){
                max=array[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La edad maxima es: "+max);
    }
    
    public void minimo(){
         min=array[0];
         for(int i=0;i<cant;i++){  
            if(array[i]<min){
                min=array[i];
            }                               
         }
         JOptionPane.showMessageDialog(null, "La edad minima es: "+min);
    }
    
    public void promedio(){
        for(int i=0;i<cant;i++){ 
            suma+=array[i];
        }
        promedio=suma/cant;
        JOptionPane.showMessageDialog(null, "El promedio de edad es: "+promedio);
    }
    
}
