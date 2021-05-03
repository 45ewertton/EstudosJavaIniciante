/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestipos;

import java.util.Scanner;

/**
 *
 * @author Ewertton
 */
public class TestesTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 30;
        String valor = Integer.toString(idade);
        O parse. serve para todas os tipos...
        
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */
        Scanner soma = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        String n1 = soma.nextLine();
        // float nn1 = Float.valueOf(n1).floatValue();
        float nn1 = Float.parseFloat(n1);
        System.out.print("Digite o segundo valor: ");
        String n2 = soma.nextLine();
        //float nn2 = Float.valueOf(n2).floatValue();
        float nn2 = Float.parseFloat(n2);
        float resultado = (nn1 + nn2);
        System.out.printf("O resultado é %.2f \n", resultado);
    }
   // float f = Float.valueOf(str).floatValue();
}
