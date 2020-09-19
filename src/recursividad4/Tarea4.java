package recursividad4;
import javax.swing.JOptionPane;
public class Tarea4 {
    public void MCD(int n1, int n2) {//4 6
        int a=Math.max(n1, n2); //6  4
        int b=Math.min(n1, n2); //4 4
        int res;
        do{
            res=b;  //4
            b=a%b;  //        2 0
            a=res; // 4
        }while(b!=0);
        JOptionPane.showMessageDialog(null, " El MCD Es " + res);   
    }
}
