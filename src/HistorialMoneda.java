import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HistorialMoneda {
    private List<String> historialMoneda;

    public HistorialMoneda(){
        this.historialMoneda = new ArrayList<>();
    }

    public void poblarHistorial(String conversion) {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaActualFormateada = fechaActual.format(formato);

        String registro = fechaActualFormateada + " " + conversion;
        historialMoneda.add(registro);
    }

    public void mostrarHistorial(){
        if (historialMoneda.isEmpty()){
            System.out.println("No se registra ninguna conversion.");
        }else {
            System.out.println("Historial de conversiones:");
            for (String registro : historialMoneda){
                System.out.println(registro);
            }
        }
    }
}
