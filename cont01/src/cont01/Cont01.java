/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cont01;

/**
 *
 * @author Ewertton
 */
public class Cont01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        
        while (cont < 50){
            cont++;
            if(cont % 2 == 0){
                continue;
            }
            if(cont == 33){
                break;
            }
            System.out.println("Cambalhota: "+ cont);
        }
    }
    
}
