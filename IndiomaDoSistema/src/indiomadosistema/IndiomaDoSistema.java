package indiomadosistema;

import java.util.Locale;

public class IndiomaDoSistema {

    public static void main(String[] args) {
        Locale indioma = new Locale("Inglês", "EUA", "New York");
        System.out.print("Criando objeto locale: ");
        System.out.println(indioma.toString());
        
        Locale indioma2 = Locale.getDefault();
        System.out.print("O indioma do sistema está em: ");
        System.out.println(indioma2.getDisplayLanguage());
    }
}
