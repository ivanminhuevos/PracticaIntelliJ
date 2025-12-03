import java.util.Scanner;

public class Main {
    private static final Scanner scn = new Scanner(System.in);

    public static void mostrarSaludo(String nombre) {
        System.out.printf("Hola, %s! Bienvenido al projecto.\n", nombre);
    }

    private static String preguntarPorNombre() {
        System.out.print("Cual es tu nombre? >");

        return scn.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Hola desde IntelliJ y Git!");

        String nombre = preguntarPorNombre();

        mostrarSaludo(nombre);
    }
}
