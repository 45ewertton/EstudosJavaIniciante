/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarvoto;

import java.util.Scanner;

/**
 *
 * @author Ewertton
 */
public class VerificarVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int anoN = teclado.nextInt();
        
        int idade = 2021 - anoN;
        
        if (idade < 16){
            System.out.println("Voto proibido!");
        }else {
            if ((idade>=16 && idade<18)|| idade > 70){
                System.out.println("Voto opcional!");
            }else {
                System.out.println("Voto obrigatório!");
            }
        }
        System.out.println(idade);
    }
    
}
