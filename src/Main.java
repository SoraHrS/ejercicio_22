import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        double salario, horasTrabajadas, salariomensual;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el salario básico por hora del empleado: ");
        salario = sc.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas por el empleado: ");
        horasTrabajadas = sc.nextDouble();
        salariomensual = salario * horasTrabajadas;

        if (salariomensual > 450000) {
            System.out.println("El nombre del empleado es: " + nombre);
            System.out.println("El salario mensual es: $" + salariomensual);
        }else{
            System.out.println("El nombre del empleado es: " + nombre);
        }


    }
}