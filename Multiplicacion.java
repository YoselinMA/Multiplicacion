import java.util.Scanner;
public class Multiplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i;
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        
    
        System.out.print("Orden ascendente:\n");
        i = 0;
        do {
            int v;
            v = numero * i;
            System.out.println(numero+"*"+ i+"="+ v);
            i++;
        } while (i <= 100);
    
        System.out.print("\nOrden descendente:\n");
        i = 100;
        while (i >= 0) {
            int c;
            c = numero * i;
            System.out.println(numero+"*"+ i+"="+ c);
            i--;
        }
    
    }
    
}
