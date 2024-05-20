import java.io.SequenceInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Lista {
    private LinkedList<PlayList> lista;
    private Scanner input;

    public Lista(Scanner input) {
        lista = new LinkedList<PlayList>();
        this.input = input;
    }
    //Metodos

    //Ver play list
    public void verPlayList(){
        if (lista.size() == 0){
            System.out.println("La PlayList esta vacia.");
        }else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(i + ". " + lista.get(i).toString());
            }
        }
    }

    //Agregar canciones a la playlist
    public void agregarCanciones(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la canción: ");
        String cancion = input.nextLine();
        System.out.println("Ingrese el nombre del Artista: ");
        String artista = input.nextLine();
        PlayList playList = new PlayList(cancion, artista);
        lista.add(playList);
        System.out.println("Canción agregada correctamente.");
    }

    //Eliminar canciones de la playlist
    public void eliminarCanciones(){
        System.out.println("Ingresa el indice de la canción que desea eliminar: ");
        int indice = input.nextInt();
        input.nextLine();
        if (indice >= 0 && indice < lista.size()){
            lista.remove(indice);
            System.out.println("Canción eliminada correctamente.");
        }else {
            System.out.println("Indice incorrecto, intenta nuevamente.");
        }
    }

    //Buscar por artista en la playlist
    public void buscarArtista(){
        System.out.println("Ingresa el indice del artista que desea buscar: ");
        int indice = input.nextInt();
        input.nextLine();
        if (indice >= 0 && indice < lista.size()){
            lista.contains(indice);
            System.out.println("La canción es: " + lista.get(indice).toString());
        }
    }
}
