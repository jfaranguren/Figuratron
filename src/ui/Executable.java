package ui;

import java.util.Scanner;

public class Executable {

    private Scanner input;

    public static void main(String[] args) {

        Executable exe = new Executable();
        exe.menu();

    }

    public Executable() {

        input = new Scanner(System.in);

    }

    public void menu() {

        System.out.println("\nBienvenido a Figuratron, tu asistente para aprender sobre figuras geometricas");
        int option = 0;

        do {
            System.out.println("\nMENU PRINCIPAL\n");
            System.out.println("1. Agregar una figura geometrica");
            System.out.println("2. Consultar la informacion del triangulo con mayor altura");
            System.out.println("3. Consultar el promedio del perimetro de todas las figuras almacenadas");
            option = input.nextInt();

            switch (option) {
                case 1:
                    agregarFigura();
                    break;
                case 2:
                    mayorTriangulo();
                    break;
                case 3:
                    promedioPerimetro();
                    break;
                case 0:
                    System.out.println("Muchas gracias por usar nuestros servicios. Adios :D");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (option != 0);

    }

    public void agregarFigura() {

    }

    public void mayorTriangulo() {

    }

    public void promedioPerimetro() {

    }

}