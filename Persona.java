/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author user
 */
public class Persona {
    String nombre;
    String apellido;
    String edad;
    String hobbie;
    String EditorCodigo;
    String SistemaOperativo;
    
    
    public Persona (String n,String a, String e, String h, String ed, String so){
        nombre=n;
        apellido=a;
        edad=e;
        hobbie=h;
        EditorCodigo=ed;
        SistemaOperativo=so;
        
    }
    
    
    public String mostrar()
    {
        return("El nombre es: "+nombre+"\n El Apellido es: "+apellido+"\nEl Hobbie es: "+hobbie+"\nEl Editor de Codigo es: "+EditorCodigo+"\nEl Sistema Operativo es: "+SistemaOperativo);
    }
    
}
