package pc1;
import javax.swing.JOptionPane;
public class ejercicio16 {
    public static void main(String[] args){
        
        int cant,opc;
        double max=0;
       
        cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de trabajadores: "));
        
        String nombre[]=new String[cant];
        double sueldo[]=new double[cant];
        
        for(int i=0;i<cant;i++){
            nombre[i]=JOptionPane.showInputDialog("Ingrese nombre del trabajador "+(i+1)+": ");
            sueldo[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo del trabajador "+(i+1)+": "));
        } 
        
       double aumentosueldo[]=new double[cant];
       
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n1. Calcular y mostrar el sueldo de cada uno de los trabajadores.\n2. Nombre del trabajador con mayor aumento de sueldo.\n3. Trabajadores que su nombre inicia con una vocal.\n4. Trabajadores que su nombre finalice con m o n, y mostrar la longitud de sus nombres.\n5. Finalizar."));
            switch(opc){
                
                case 1:
                    
                    for(int i=0;i<cant;i++){
                        if(sueldo[i]<410){
                            aumentosueldo[i]=sueldo[i]*20/100;
                        }
                        if(sueldo[i]>=410 && sueldo[i]<=1600){
                            aumentosueldo[i]=sueldo[i]*10/100;
                        }
                        if(sueldo[i]>1600){
                            aumentosueldo[i]=sueldo[i]*5/100;
                        }
                        JOptionPane.showMessageDialog(null, "Nombre: "+nombre[i]+". Aumento de sueldo: "+Math.rint(aumentosueldo[i]*100)/100);
                    }                 
                    
                case 2:
                    
                    String cadena=nombre[0];
                    for(int i=0;i<cant;i++){
                        if(sueldo[i]>max){
                            max=sueldo[i];
                            cadena=nombre[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El trabajador "+cadena+" tiene el sueldo maximo de: "+max);
                    break;
                    //alicia
                case 3:
                    for(int i=0;i<cant;i++){
                        if(nombre[i].startsWith("a") || nombre[i].startsWith("e") || nombre[i].startsWith("i") || nombre[i].startsWith("o") || nombre[i].startsWith("u") ){
                        String output=nombre[i].substring(0,1).toUpperCase()+nombre[i].substring(1);
                        JOptionPane.showMessageDialog(null, "Nombre "+(i+1)+": "+output);
                        }
                    }
                    break;
                    
                case 4:
                    for(int i=0;i<cant;i++){
                        if(nombre[i].endsWith("m") || nombre[i].endsWith("n")){
                            JOptionPane.showMessageDialog(null, "Nombre: "+nombre[i]+". Longitud: "+nombre[i].length());
                        }                                            
                    }
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
                    
                
            }
        }while(opc!=5);
    }
}

