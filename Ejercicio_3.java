import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int i=0, productos, cantidad,unidades=5;
        System.out.println("Indique el numero de productos");
        productos= sc.nextInt();
         while (i<productos){
             System.out.println("Cantidad disponible del producto "+(i+1)+": ");
             cantidad=sc.nextInt();
             if (cantidad<unidades){
                 System.out.println("Es necesario realizar un pedido del producto "+(i+1));
             }else{
                 System.out.println("Tienes unidades suficientes");
             }
             i++;
         }
    }
}
