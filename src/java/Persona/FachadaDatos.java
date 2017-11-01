/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.io.IOException;

/**
 *
 * @author Jose
 */
public class FachadaDatos {
    private DatosNO nombres = new DatosNO();
    private DatosNU numericos = new DatosNU();
    
    public void guardarDatos(Persona p) throws IOException{
    nombres.guardarNombres(p);
    numericos.guardarNumericos(p);
    
    }
}
