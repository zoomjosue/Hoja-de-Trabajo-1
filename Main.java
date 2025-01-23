/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Este programa está hecho para simular el funcionamiento de una licuadora.
 *  Fecha de creación: 18/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Licuadora licuadora = new Licuadora();
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
                    licuadora.SpeedUp();
                    break;

                case "2":
                    licuadora.SpeedDown();
                    break;
                
                case "3":
                    System.out.println("\nVelocidad: " + licuadora.GetSpeed());
                    break;

                case "4":
                    licuadora.Fill();
                    break;

                case "5":
                    licuadora.Empty();
                    break;

                case "6":
                    if(licuadora.IsFull()){
                        System.out.println("La licuadora está llena.");
                    } else {
                        System.out.println("La licuadora está vacía.");
                    }
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