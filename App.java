import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {
    public static void main(String[] args) throws Exception {
        try {
            FileReader archivoFisico = new FileReader("C:\\Users\\Luis Urias\\codigospostales\\codigos_postales.csv");

            BufferedReader archivoLogico = new BufferedReader(archivoFisico);
            String registro = null;
            int counter = 0;
            int uwu = 0;
            archivoLogico.readLine(); // leer encabezado con nombres de columna
            String campos[];
            String owo = "Urbano";
            

            while ( (registro = archivoLogico.readLine()) != null ) {
                campos = registro.split(",");
                if (campos[2].equals(owo)) {
                    counter++;
                }else{
                    uwu++;
                }  
            }
            System.out.println("Numero de asentamientos Urbanos: "+counter);
            System.out.println("Numero de asentamientos Rurales: "+uwu);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}