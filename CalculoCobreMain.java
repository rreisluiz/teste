import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoCobreMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo por KG:");
        String valorCustoKg = scan.nextLine();
        double custoKg = Double.parseDouble(valorCustoKg);

        System.out.println("Digite a quantidade de KG:");
        String valorQuantKg = scan.nextLine();
        int quantKg = Integer.parseInt(valorQuantKg);

        System.out.println("Digite o tamanho da bitola:");
        String tamBitola = scan.nextLine();

        double metroKg = 0;

        switch (tamBitola) {
            case "1/4":
                metroKg = 1 / 0.127;
                break;

            case "3/8":
                metroKg = 1 / 0.200;
                break;

            case "1/2":
                metroKg = 1 / 0.273;
                break;

            case "5/8":
                metroKg = 1 / 0.340;
                break;

            case "3/4":
                metroKg = 1 / 0.413;
                break;
            default:
                break;
        }

        double metroCobre;
        metroCobre = quantKg * metroKg;

        double custoMetro;
        custoMetro = custoKg / metroKg;

        double custoTotal;
        custoTotal = custoMetro * metroCobre;

        String formatoDecimal = "#.00";
        DecimalFormat duasCasas = new DecimalFormat(formatoDecimal);

        String formatoDinheiro = "R$ #.00";
        DecimalFormat dinheiro = new DecimalFormat(formatoDinheiro);

        System.out.println("A quantidade de metros é: " + duasCasas.format(metroCobre));
        System.out.println("O custo por metro é: " + dinheiro.format(custoMetro));
        System.out.println("O custo total é: " + dinheiro.format(custoTotal));
    }
    
}