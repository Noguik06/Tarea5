package model;

/**
 * Esta clase maneja todas las opearciones matematicas que se hagan
 * 
 * @author Juan Noguera
 */
public class Funciones {

    /**
     * Metodo para calucar la integracion numerica
     * @param claseDatos
     * @return integracion Double valor
     */
    public static double calcularIntegracionNumerica(ClaseDatos claseDatos) {

        double integracion = (claseDatos.getTamanoSegmentos()/ 3) * 1 * 
                functionX(claseDatos.getValorX()* 0, claseDatos.getGradoLibertad());
        for (int i = 1; i < claseDatos.getNumeroSegmentos(); i++) {
            if (i % 2 == 0) {
                integracion = integracion + (claseDatos.getTamanoSegmentos()/ 3) * 2 * 
                        functionX(claseDatos.getTamanoSegmentos()* i, claseDatos.getGradoLibertad());
            } else {
                integracion = integracion + (claseDatos.getTamanoSegmentos()/ 3) * 4 * 
                        functionX(claseDatos.getTamanoSegmentos()* i, claseDatos.getGradoLibertad());
            }

        }
        integracion = integracion + (claseDatos.getTamanoSegmentos()/ 3) * 1 * 
                functionX(claseDatos.getValorX(), claseDatos.getGradoLibertad());
        return integracion;
    }
    
    /**
     * Metodo para calcular f(x)
     *
     * @param valorX double
     * @param gradoDeLibertad double
     * @return f(x) result
     */
    public static double functionX(double valorX, double gradoDeLibertad) {
        double x1 = 1 + ((Math.pow(valorX, 2)) / gradoDeLibertad);
        double exp = (double) (gradoDeLibertad + 1) / 2;
        x1 = Math.pow(x1, -exp);
        if(exp > 0){
            exp--;
        }
        double tmp = gradoDeLibertad / 2;
        if(tmp > 0){
            tmp --;
        }
        double x2 = factorial(exp) / (Math.pow(gradoDeLibertad * Math.PI, 0.5) * factorial(tmp));
        return x2 * x1;
    }
   
    /**
     * Metdo encargado de calcular el factorial de un numero
     * 
     * @param valor
     * @return resultado factorial
     */
    public static double factorial(double valor) {
        if (valor == 0) {
            return 1.0;
        } else if (valor == 0.5) {
            return valor * Math.sqrt(Math.PI);
        } else {
            return valor * factorial(valor - 1);
        }

    }
}
