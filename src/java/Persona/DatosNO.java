/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jose
 */
public class DatosNO {
    public void guardarNombres(Persona p) throws IOException{
        File ficheroN = new File("D:\\DatosNo.txt");
        FileWriter Fr = new FileWriter (ficheroN);
        PrintWriter pw  = new PrintWriter(Fr);
        BufferedWriter Esc = new BufferedWriter((Fr));
        Esc.write("Nombre: "+p.nombre);
        pw.println("Nombre: "+p.nombre);
        Esc.write("Apellido: "+p.apellido);
        pw.println("Apellido: "+p.apellido);
        Esc.write("Ciudad: "+p.ciudad);
        pw.println("Ciudad: "+p.ciudad);
        Esc.write("Estado Civil: "+p.estadoc);
        pw.println("Estado Civil: "+p.estadoc);
        Esc.write("Lugar de nacimiento: "+p.lugar_n);
        pw.println("Lugar de nacimiento: "+p.lugar_n);
        Esc.write("Tipo de Documento: "+p.tipdoc);
        pw.println("Tipo de Documento: "+p.tipdoc);
        Esc.write("Género: "+p.gen);
        pw.println("Género: "+p.gen);
        Esc.close();
        pw.close();
        System.out.println("Persona.DatosNO.guardarNombres()");
    }
    
    
}
