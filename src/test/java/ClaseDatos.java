/**
 * Clase para manejar los datos del tipo de objeto que se va a manejar
 * @author Juan Noguera
 */
public class ClaseDatos {
    
    private double valorX;
    private int numeroSegmentos;
    private int gradoLibertad;
    private double tamanoSegmentos;

    public double getValorX() {
        return valorX;
    }

    public void setValorX(double valorX) {
        this.valorX = valorX;
    }

    public int getNumeroSegmentos() {
        return numeroSegmentos;
    }

    public void setNumeroSegmentos(int numeroSegmentos) {
        this.numeroSegmentos = numeroSegmentos;
    }

    public int getGradoLibertad() {
        return gradoLibertad;
    }

    public void setGradoLibertad(int gradoLibertad) {
        this.gradoLibertad = gradoLibertad;
    }

    public double getTamanoSegmentos() {
        return tamanoSegmentos;
    }

    public void setTamanoSegmentos(double tamanoSegmentos) {
        this.tamanoSegmentos = tamanoSegmentos;
    }
}
