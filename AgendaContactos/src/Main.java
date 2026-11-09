import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1)Añadir contacto\n" + "2)Mostrar contactos\n" + "3)Buscar contacto\n" + "4)Salir\n");
        System.out.println("Donde quieres acceder?");

        int option = sc.nextInt();

        switch (option) {
            case 1-> System.out.println("Has seleccionado: Añadir contacto");
            case 2 -> System.out.println("Has seleccionado: Mostrar contactos");
            case 3 -> System.out.println("Has seleccionado: Buscar contacto");
            case 4 -> System.out.println("Has seleccionado: Salir");
            default -> System.out.println("Opción no válida"); vnbvv
        }
    }
}
