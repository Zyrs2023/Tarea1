
package sumamatrix;

import javax.swing.JOptionPane;


public class Sumamatrix {

    
    public static void main(String[] args) {
        int i, j, opc;
        int mat[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        int mat3[][] = new int[3][3];
        int vec[] = new int[3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mat[i][j] = (int) (Math.random() * 5 + 1);
                mat2[i][j] = (int) (Math.random() * 5 + 1);
                vec[i]=mat[i][j]+mat2[i][j];
            }
        }
        String m = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                m += mat[i][j];
                m += "|";
            }
            m += "\n";
        }
        

        String m2 = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                m2 += mat2[i][j];
                m2 += "|";
            }
            m2 += "\n";
        }
        
        String m3 = "";
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                
                vec[i]=mat[i][j]+mat2[i][j];
                m3+=vec[i];
                m3 += "|";
            }
            
            
            JOptionPane.showMessageDialog(null, """
                                                El matrix numero 1 es 
                                                """+m+"\n"+"La matris 2 es "+"\n"+m2+"\n"+"La suma de la matrices es "+"\n"+m3+"\n");
        }
    }
    
}
