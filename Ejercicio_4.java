import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int semana=7, ventas,total=0;
        String[] dias= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

        for (int i = 0; i < semana ; i++) {
            System.out.println("Cuantas ventas se realizaron el dia "+dias[i]);
            ventas= sc.nextInt();
            total=total+ventas;
        }
        System.out.println("El total de ventas de la semana fue de "+total);
    }
}
