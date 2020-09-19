package pc1;
import javax.swing.JOptionPane;
public class PC1 {

    public static void main(String[] args) {
        int array[][]={{5,44,89,32,5,66,89,5,5},{66,32,11,32,89,44,32,89,89},{89,5,89,66,5,89,44,32,89},{5,32,5,44,66,11,32,66,5},{66,89,66,32,89,5,66,89,89}};
        String cadena="";
        int s1=0,s2=0,suma=0,resultado;
        
        for(int i=0;i<5;i++){
            cadena=cadena+"\n";
            for(int j=0;j<9;j++){
                cadena=cadena+" "+array[i][j];
                suma+=array[i][j];
            }
        }
        
        JOptionPane.showMessageDialog(null, cadena);
        
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                if((i+j)<=3){
                    s1+=array[i][j];
                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                if((j-i)>=5){
                    s2+=array[i][j];
                }
            }
        }
        
        resultado=suma-(s1+s2);
        
        JOptionPane.showMessageDialog(null, "La suma de elementos es: "+resultado);
    }
    }
    

