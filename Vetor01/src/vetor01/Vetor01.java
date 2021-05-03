/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Ewertton
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int totDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int c=0; c<mes.length; c++){
            System.out.println("O mês: " + mes[c] + " tem " + totDias[c] + " dias.");
        
        
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        
        //Arrays.sort(v); //ordena
        for(int v: vet){
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, 6);
        System.out.println("Encontrei o valor na posição " + p);*/
        
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for(int valor: v){
        System.out.println(valor);
        }
    }
    
}
