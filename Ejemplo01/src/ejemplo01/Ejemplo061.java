/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombre = "Alex Bravo";
        String apellido = "Bravo Celi";
        int nacimiento = 2006;
        String direccion = "san cayetano bajo";
        String universidad = "utpl";
        String ciclo = "primer cliclo";
        String asignatura = "introduccion a la programacion";
        String paralelo = "a";
                
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n\t%s\nApellido:\t%sNacimiento:\n\t%sDireccion:\n\t%sUniversidad:\n\t%sCliclo:\n\t%sAsignatura:\n\t%sParalelo:\n\t%s",nombre,apellido,nacimiento,direccion,universidad,ciclo,asignatura,paralelo);
        
     // nombre = "Alex Bravo";
        // apellido = "Bravo Celi";
        //int nacimiento = 2006;
        // direccion = "san cayetano bajo";
        // universidad = "utpl";
        //ciclo = "primer cliclo";
        // asignatura = "introduccion a la programacion";
        //paralelo = "a";
    }
}
