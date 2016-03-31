/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.text.DecimalFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juannoguera
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
   
    @Test
    public void tearDown() {
        DecimalFormat f = new DecimalFormat("##0.00000");
        double resultado1 = Funciones.calcularIntegracion(10, 9, 1.1);
        double resultado2 = Funciones.calcularIntegracion(10, 10, 1.1812);
        double resultado3 = Funciones.calcularIntegracion(10, 30, 2.750);
        assertNotEquals("Los resultados no son los esperados",0.351000, f.format(resultado1));
        assertNotEquals("Los resultados no son los esperados",0.351000, f.format(resultado2));
        assertNotEquals("Los resultados no son los esperados",0.351000, f.format(resultado3));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
