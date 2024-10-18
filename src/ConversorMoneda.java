import java.util.Scanner;

public class ConversorMoneda {

    public static String convertir (String monedaBase,
                                  String monedaObjetivo,
                                  ConsultaMoneda consulta,
                                  Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscaMoneda(monedaBase, monedaObjetivo);
        System.out.println("Tasa de conversion actual es 1 "+monedaBase+" = "+moneda.conversion_rate()+" "+monedaObjetivo);
        System.out.println("Ingrese la cantidad de "+monedaBase+" a convertir");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        String resultado = cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+moneda.target_code();
        System.out.println(resultado);
        return resultado;
    }

    public static String conversorGeneral(ConsultaMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo ISO de la moneda a convertir:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el codigo ISO de la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        return convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
