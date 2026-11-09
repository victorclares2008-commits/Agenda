import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        String edad = sc.nextLine();
        String lugar = sc.nextLine();

        System.out.println("<?xml version=1.0 encoding=UTF-8?>");
        System.out.println();
        System.out.println("<persona>");
        System.out.println("<nombre>" + nombre +"</nombre>");
        System.out.println("<edad>" + edad + "</edad>");
        System.out.println("<ciudad>" + lugar + "</ciudad>");
        System.out.println("</persona>");



    }
}
