import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creo un arreglo con las actividades
        String[] actividades = {"Estudiar" , "Hacer ejercicio", "Leer", "Tiempo libre"};
        int tam= actividades.length; //a la variable tam le asigno la longitud del arreglo
        double [] act_hora= new double[tam]; //creo un arreglo para guardar las horas utilizadas en cada actividad
        double hora,horas;
        horas=0;
        for (int i = 0; i < tam; i++) {
            System.out.println("Cuantas horas utilizas para "+actividades[i]+"?");
            hora=sc.nextDouble(); //indico las horas utilizadas
            act_hora[i]=hora;
            horas=horas+hora;
        }
        //Imprimo las actividades y las horas utilizadas en cada una
        for (int i = 0; i < tam; i++) {
            System.out.println(actividades[i]+": "+act_hora[i]);
        }

        System.out.println("EL total de horas que utilizas en actividades es: "+horas);
    }
}
