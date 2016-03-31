
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
import model.ClaseDatos;
import model.Funciones;

/**
 * Clase Principal
 *
 * @author Juan Noguera
 */
public class Main {

    public static void main(String[] args) {

        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/tarea5", (req, res) -> {
            DecimalFormat f = new DecimalFormat("##0.00000");
            double resultado1 = calcularIntegracion(10, 9, 1.1);
            double resultado2 = calcularIntegracion(10, 10, 1.1812);
            double resultado3 = calcularIntegracion(10, 30, 2.750);

            String resultado = ""
                    + "Valor Esperado: 0,35006 "
                    + "<br/>"
                    + "Valor Obtenido: "+ f.format(resultado1) + " "
                    + "<br/>"
                    + "<br/>"
                    + "Valor Esperado: 0,36757 "
                    + "<br/>"
                    + "Valor Obtenido: "+ f.format(resultado2) + " "
                    + "<br/>"
                    + "<br/>"
                    + "Valor Esperado: 0,49500 "
                    + "<br/>"
                    + "Valor Obtenido: "+ f.format(resultado3) + " "
                    + "<br/>"
                    + "<br/>";
            return resultado;

        });

        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());

    }
    
    /**
    * Metodo para calcular el resultado de la funcion de integracion
     * @param numeroSegmentos
     * @param gradoLibertad
     * @param valorX
     * @return calculoIntegracion
    */
    public static double calcularIntegracion(int numeroSegmentos, int gradoLibertad, double valorX) {
        ClaseDatos claseDatos = new ClaseDatos();
        claseDatos.setNumeroSegmentos(numeroSegmentos);
        claseDatos.setGradoLibertad(gradoLibertad);
        claseDatos.setValorX(valorX);
        claseDatos.setTamanoSegmentos(claseDatos.getValorX()/ claseDatos.getNumeroSegmentos());
        
        double p1 = Funciones.calcularIntegracionNumerica(claseDatos);
        claseDatos.setNumeroSegmentos(claseDatos.getNumeroSegmentos()* 2);
        claseDatos.setTamanoSegmentos(claseDatos.getValorX()/ claseDatos.getNumeroSegmentos());
        double p2 = Funciones.calcularIntegracionNumerica(claseDatos);
        if (p1 - p2 < Math.E) {
            return p2;

        } else {
            return calcularIntegracion(numeroSegmentos, gradoLibertad, valorX);
        }

    }
}
