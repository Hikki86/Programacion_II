package pc1;
import javax.swing.JOptionPane;
public class ejercicio12 {
    public static void main(String[]args){
    int arreglo[][]={{5,44,89,32,5,66,89,5,5},{66,32,11,32,89,44,32,89,89},{89,5,89,66,5,89,44,32,89},{5,32,89,44,66,11,32,66,5},{66,89,66,32,89,5,66,89,89},{44,32,32,5,66,66,89,5,5},{32,89,44,89,32,77,32,66,89},{5,5,89,5,44,89,66,44,5},{32,89,44,89,32,77,32,66,89}};    
    String cadena="";
    int s1=0,s2=0,s3=0,s4=0,suma=0,resultado;
    
    for(int i=0;i<9;i++){
        cadena=cadena+"\n";
        for(int j=0;j<9;j++){
            cadena=cadena+" "+arreglo[i][j];
            suma+=arreglo[i][j];
        }
    }
    JOptionPane.showMessageDialog(null, cadena);
    //378+501+518+639 2036 2049 4643
    for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if((i+j)<=3){
                    s1+=arreglo[i][j];
                }
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if((j-i)>=5){
                    s2+=arreglo[i][j];
                }
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if((i-j)>=5){
                    s3+=arreglo[i][j];
                }
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if((j+i)>=13){
                    s4+=arreglo[i][j];
                }
            }
        }
        resultado=suma-s1-s2-s3-s4;
        
        JOptionPane.showMessageDialog(null, s1);
        JOptionPane.showMessageDialog(null, s2);
        JOptionPane.showMessageDialog(null, s3);
        JOptionPane.showMessageDialog(null, s4);
        JOptionPane.showMessageDialog(null, "La suma es: "+resultado);
    }
}
