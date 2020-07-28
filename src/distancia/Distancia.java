package distancia;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distancia {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       DecimalFormat decimales = new DecimalFormat("#.000");
       double lat1 = (double) 0;
       double lat2 = (double) 0;
       double lon1 = (double) 0;
       double lon2 = (double) 0;
       String ciudad1 = "";
       String ciudad2 = "";
       
       System.out.println ("Para hallar la distancia entre dos ciudades sigue las instrucciones:");
       System.out.println("Escribe el nombre de la primera ciudad:");
       ciudad1 = entrada.nextLine();
       System.out.println("Escribe el nombre de la segunda ciudad:");
       ciudad2 = entrada.nextLine();
       System.out.println ("Escribe la latitud de" + " " + ciudad1 + " " + "en decimales usando coma:");
       lat1 = entrada.nextDouble();
       System.out.println("Escribe la longitud de" + " " + ciudad1 + ":");
       lon1 = entrada.nextDouble();
       System.out.println ("Ahora escribe la latitud de" + " " + ciudad2 + ":");
       lat2 = entrada.nextDouble();
       System.out.println("Por ultimo escribe la longitud de" + " " + ciudad2 + ":");
       lon2 = entrada.nextDouble();
       double distancia = (double)((6371.07*Math.acos(Math.sin(lat1)))*(Math.sin(lat2)+ Math.cos(lat1))*(Math.cos(lat2)*Math.cos(lon1-lon2)));
       System.out.println("");
       System.out.println("La distancia entre" + " " + ciudad1 + " " + "y" + " " + ciudad2 + " " + "es:" + " " + decimales.format(distancia) + "km");
    }
}