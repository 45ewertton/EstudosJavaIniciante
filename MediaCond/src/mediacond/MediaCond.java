/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediacond;

import java.util.Scanner;

/**
 *
 * @author Ewertton
 */
public class MediaCond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escreva o nome do aluno: ");
        String nomeA = teclado.nextLine();
        
        System.out.println("Digite a primeira nota do aluno: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota do aluno: ");
        float nota2 = teclado.nextFloat();
        
        float m = (nota1 + nota2) / 2;
        
        System.out.println("A média do aluno "+ nomeA +" foi: "+ m);
        
        if (m>=7) {
            System.out.println("Aluno aprovado, parabéns!!!");
        } else {
            System.out.println("Aluno reprovado, estude mais");
        }
    }
    
}
