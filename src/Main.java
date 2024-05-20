import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    LinkedList<PlayList> lista;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lista lista = new Lista(input);

        while (true){
            System.out.println("MENU");
            System.out.println("[1]. Agregar Canción");
            System.out.println("[2]. Eliminar Canción");
            System.out.println("[3]. Ver PlayList");
            System.out.println("[4]. Buscar canción por artista");
            System.out.println("[0]. Salir");

            System.out.println("Ingresa una opción del (1 - 4) o (0 para salir del programa): ");
            int opcion = input.nextInt();
            input.nextLine();
            switch (opcion){
                case 0:
                    System.out.println("Adios!");
                    System.exit(0);
                case 1:
                    lista.agregarCanciones();
                    break;
                case 2:
                    lista.verPlayList();
                    lista.eliminarCanciones();
                    break;
                case 3:
                    lista.verPlayList();
                    break;
                case 4:
                    lista.verPlayList();
                    lista.buscarArtista();
                    break;
                default:
                    System.out.println("Opcion invalida, intenta de nuevo \n");
            }
        }
    }
}
