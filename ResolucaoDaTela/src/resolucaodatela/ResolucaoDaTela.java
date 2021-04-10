package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
    Dimension reso = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("A resolução da sua tela é: ");
        System.out.println(reso.getHeight() +" X "+ reso.getWidth());
    }
    
}
