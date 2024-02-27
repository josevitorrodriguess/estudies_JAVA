package poo.lerCotacaoDolar;
import java.util.Locale;

public class CurrencyConverter {

    public  static double cotacaoDolar;
    public static double valorDolarCompra;
    public static double  IOF = 0.06;

    public static double converterDolar(){
       double calcIOF = valorDolarCompra * (1 + IOF);
       return calcIOF*cotacaoDolar;
    }
}
