/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Ewertton
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Hello World!", "Boas Vindas!", JOptionPane.INFORMATION_MESSAGE);
        int n;
        int totVal = 0;
        int totPar = 0;
        int totImpar = 0;
        int tot100 = 0;
        int contM = 0;
        float media = 0;
        do{
          n = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "<html>Informe um número <br><em>o valor 0 interrompe.</em></html>"));
          JOptionPane.showMessageDialog(null, "Você digitou o valor "+ n);  
          
          totVal++;
          
          if (n % 2 == 0){
              totPar++;
          }else {
              totImpar++;
          }
          
          if (n > 100){
              tot100++;
          }
          
          contM += n;
          
        }while(n != 0);
        media = contM / totVal;
        JOptionPane.showMessageDialog(null, "<html>O total de números foi: " + totVal + 
                "<br>O total de números pares foi: " + totPar + 
                "<br>O total de números ímpares foi: " + totImpar +
                "<br>O total de números maiores que 100 foi: " + tot100 + 
                "<br>A média dos números foi: " + media + "</html>");
    }
    
}
