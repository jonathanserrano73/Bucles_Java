import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int empleados,i=0;
        double horas,tot_horas=40,extras;
        System.out.println("Indica la cantidad de empleados: ");
        empleados= sc.nextInt();
        do {
            System.out.println("Ingrese las horas trabajadas por el empleado "+(i+1)+": ");
            horas= sc.nextDouble();
            if (horas>tot_horas){
                extras=horas-tot_horas;
                System.out.println("El empleado "+(i+1)+" trabajo "+extras+ " horas extras");
            }else {
                System.out.println("El empleado no trabajo horas extras");
            }
            i++;
        }while (i<empleados);
    }
}
