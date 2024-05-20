public class PlayList {
    private String nombreCancion;
    private String nombreArtista;

    public PlayList(String nombreCancion, String nombreArtista) {
        this.nombreCancion = nombreCancion;
        this.nombreArtista = nombreArtista;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        String cancion = nombreCancion;
        String artista = nombreArtista;
        return cancion + " - " + artista;
    }
}
