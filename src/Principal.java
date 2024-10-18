import java.util.Scanner;

public class Principal {

    private static HistorialMoneda historialMoneda = new HistorialMoneda();

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion!= 9){
            System.out.println("*************************************\n"+
                    "¡Bienvenido al conversor de monedas!\n\n"+
                    "Ingrese la opcion que desea realizar\n" +
                    "1--> Dollar a Peso Argentino\n" +
                    "2--> Peso Argentino a Dollar\n" +
                    "3--> Dollar a Real Brasilero\n" +
                    "4--> Real Brasilero a Dollar\n" +
                    "5--> Dollar a Peso Colombiano\n" +
                    "6--> Peso Colombiano a Dollar\n" +
                    "7--> Convertir otra moneda\n" +
                    "8--> Ver historial conversiones\n" +
                    "9--> Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    String conversion1 = ConversorMoneda.convertir("USD", "ARS", consulta, lectura);
                    historialMoneda.poblarHistorial(conversion1);
                    break;
                case 2:
                    String conversion2 = ConversorMoneda.convertir("ARS", "USD", consulta, lectura);
                    historialMoneda.poblarHistorial(conversion2);
                    break;
                case 3:
                    String conversion3 = ConversorMoneda.convertir("USD", "BRL", consulta, lectura);
                    historialMoneda.poblarHistorial(conversion3);
                    break;
                case 4:
                    String conversion4 = ConversorMoneda.convertir("BRL", "USD", consulta, lectura);
                    historialMoneda.poblarHistorial(conversion4);
                    break;
                case 5:
                    String conversion5 = ConversorMoneda.convertir("USD", "COP", consulta, lectura);
                    historialMoneda.poblarHistorial(conversion5);
                    break;
                case 6:
                    String conversion6 = ConversorMoneda.convertir("COP", "USD", consulta, lectura);
                    historialMoneda.poblarHistorial(conversion6);
                    break;
                case 7:
                    String conversion7 = ConversorMoneda.conversorGeneral(consulta, lectura);
                    historialMoneda.poblarHistorial(conversion7);
                    break;
                case 8:
                    historialMoneda.mostrarHistorial();
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
