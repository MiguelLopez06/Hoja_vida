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
public class DatosNU {
    public void guardarNumericos(Persona p) throws IOException{
        File ficheroN = new File("D:\\DatosNuméricos.txt"); 
        FileWriter Fr = new FileWriter (ficheroN);
        PrintWriter pw  = new PrintWriter(Fr);
        BufferedWriter Esc = new BufferedWriter((Fr));
        Esc.write("Dirección: "+p.direc);
        Esc.write("E-mail: "+p.email);
        Esc.write("Fecha de nacimiento: "+p.fnac);
        Esc.write("Número de Identificación: "+p.id);
        Esc.write("Número de teléfono: "+p.tel);
        pw.println("Dirección: "+p.direc);
        pw.println("E-mail: "+p.email);
        pw.println("Fecha de nacimiento: "+p.fnac);
        pw.println("Número de Identificación: "+p.id);
        pw.println("Número de teléfono: "+p.tel);
        Esc.close();
        pw.close();
        System.out.println("Persona.DatosNU.guardarNumericos()");
    }
}
