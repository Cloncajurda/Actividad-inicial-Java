package crud;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nombre;
        String apellido;
        String edad;
        String hobbie;
        String editorCodigo;
        String sistemaOperativo;
        
        System.out.println("Ingrese su nombre: ");
        nombre = in.nextLine();

        System.out.println("Ingrese su apellido: ");
        apellido = in.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = in.nextLine();
        
        System.out.println("Ingrese su hobbie: ");
        hobbie = in.nextLine();
        
        System.out.println("Ingrese su Editor de Codigo Preferido: ");
        editorCodigo = in.nextLine();
        
        System.out.println("Ingrese su Sistema Operativo que utiliza: ");
        sistemaOperativo = in.nextLine();
        
        
        
        
        Persona usuario = new Persona(nombre, apellido, edad, hobbie, editorCodigo, sistemaOperativo);
        System.out.println("METODO= " + usuario.mostrar());

    }

}
