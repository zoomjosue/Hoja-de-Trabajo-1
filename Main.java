import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        while (!opcion.equals("7")) {

            System.out.println("\n\n================== Simulador de Licuadora ====================\n");
            System.out.println("1. Aumentar velocidad");
            System.out.println("2. Disminuir velocidad");
            System.out.println("3. Verificar velocidad");
            System.out.println("4. Llenar licuadora");
            System.out.println("5. Vaciar licuadora");
            System.out.println("6. Verificar si la licuadora está llena");
            System.out.println("7. Salir");

            System.out.print("\nIngrese el número de la opción deseada: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":

                    break;

                case "2":

                    break;
                

                case "3":
        
                    break;

                case "4":

                    break;

                case "5":

                    break;

                case "6":

                    break;

                case "7":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}