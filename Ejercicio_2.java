import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double hora,salario;
        int i=0,sal_hora=15;
        System.out.println("Indique la cantidad de empleados: ");
        int empleados= sc.nextInt();

        while (i<empleados){
            System.out.println("Cuantas horas trabajo el empleado "+(i+1)+": ");
            hora=sc.nextDouble();
            salario=hora*sal_hora;
            System.out.println("El salario para el empleado "+(i+1)+" es: "+salario );
            i++;

        }
    }
}
