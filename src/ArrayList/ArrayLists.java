/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args){
        Persona persona1 = new Persona(1, "Estiben", 23);
        List<Persona> lista = new ArrayList<Persona>();

        lista.add(persona1);
        lista.add(new Persona(2, "Yose", 13));
        lista.add(new Persona(3, "Kira", 2));

        // Recorrer con for
        System.out.println("-----FOR------");
        for(int i =0; i< lista.size(); i++){
            System.out.println("El nombre de la persona es : " + lista.get(i).getNombre());
        }

        // Recorrer con un forEach
        System.out.println("-----FOREACH-----");
        for(Persona persona: lista){
            System.out.println("El nombre de la persona es : " + persona.getNombre());
        }

    }

}
