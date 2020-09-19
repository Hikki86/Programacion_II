package pc1;
import javax.swing.JOptionPane;
public class E15 {
    int cant;
    String nombre[];
    String mayor="";
    int cont;
    
    public void datos(){
        cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de nombres: "));
        nombre=new String[cant];
        
        for(int i=0;i<cant;i++){
            nombre[i]=JOptionPane.showInputDialog("Ingrese nombre "+(i+1)+": ");
        }
    }
    
    public void vocal(){     
        for(int x=0;x<cant;x++){
            char[] array=nombre[x].toCharArray();
            cont=0;
            for(int z=0;z<array.length;z++){
                if(array[z]=='a' || array[z]=='e' || array[z]=='i' || array[z]=='o' || array[z]=='u') {
                cont++;
                }               
            }
            JOptionPane.showMessageDialog(null, "El nombre "+nombre[x]+" tiene "+cont+" vocal(es)");
            }
        }
                  
    public void mayuscula(){
        for(int i=0;i<cant;i++){
            String output=nombre[i].substring(0,1).toUpperCase()+nombre[i].substring(1);
            JOptionPane.showMessageDialog(null, "Nombre "+(i+1)+": "+output);
        }
    }
    
    public void mayor(){
        for(int i=0;i<cant;i++){
            if(nombre[i].length()>mayor.length()){
                mayor=nombre[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El nombre mas largo es: "+mayor);
    }     
}
