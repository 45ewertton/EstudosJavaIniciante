/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadortern;

/**
 *
 * @author Ewertton
 */
public class OperadorTern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, result;
        n1 = 14;
        n2 = 4;
        result = (n1 > n2) ? n1 + n2 : n1 - n2;
        System.out.println(result);
    }
    
}
