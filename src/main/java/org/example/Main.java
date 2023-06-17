package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Periodico periodico = new Periodico();

        executeGame(periodico);
    }

    private static  void executeGame(Periodico periodico){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- suscribir lector\n" +
                "2- desuscribir lector \n" +
                "3- publicar articulo\n" +
                "8- Salir");

        int menuOption = sc.nextInt();
        switch (menuOption){
            case 1:
                System.out.println("Subscribir lector");
                String nameToBeAdded = sc2.nextLine();

                Lector lector = new Lector(nameToBeAdded);
                periodico.addObserver(lector);

                System.out.println("lector  suscrito.");
                executeGame(periodico);
                break;

            case 2:
                periodico.getObservers().forEach(System.out::println);

                System.out.println("Desuscribir lector");
                String nameToBeRemoved = sc2.nextLine();

                periodico.removeByName(nameToBeRemoved);
                System.out.println("Lector desuscrito.");
                executeGame(periodico);
                break;

            case 3:
                System.out.println("Publicar articulo");
                String titulo = sc2.nextLine();
                periodico.addArticulo(titulo);
                executeGame(periodico);
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}