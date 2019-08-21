
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RubenAlonso
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] aiDatos = new int[5];
        Persona[] apDatos = new Persona[5];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < apDatos.length; i++) {
            apDatos[i] = new Persona();
            System.out.println("Nombre: "); 
            apDatos[i].setNombre(sCaptu.nextLine());
            System.out.println("Apellido: ");
            apDatos[i].setApellido(sCaptu.nextLine()); 
            System.out.println("Edad: "); 
            apDatos[i].setEdad(sCaptu.nextInt());
            sCaptu.nextLine();
            System.out.println("Nacionalidad: ");
            apDatos[i].setNacionalidad(sCaptu.nextLine());  
        }
        for (int i = 0; i < apDatos.length; i++) {
            System.out.println("DATOS DE LA PERSONA:");
            System.out.println("Nombre completo: "
            + apDatos[i].getNombre() + " " + 
                    apDatos[i].getApellido());
            System.out.println("Edad: " + apDatos[i].getEdad());
            System.out.println("Nacionalidad: " + apDatos[i].getNacionalidad());
        }
    }    
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;

    public Persona() {
        nombre = "Rubén";
        apellido = "Hernández";
        edad = 37;
        nacionalidad = "Mexicano";
    }

    public Persona(String nombre, String apellido, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
