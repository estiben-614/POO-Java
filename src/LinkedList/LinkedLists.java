package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String args[]) {
        List<Persona> lista = new LinkedList<>();

        lista.add(new Persona(1, "Estiben", 23));
        lista.add(new Persona(2, "Yose", 12));
        lista.add(new Persona(3, "Kira", 2));

        //Agregamos un elemento al inicio de la lista
        lista.add(0, new Persona(4, "Lei", 22));

        //Eliminemos un elemento

        String nombrePersonaEliminar = "Lei";

        for(Persona persona: lista) {
            if(persona.getNombre().equals(nombrePersonaEliminar)) {
                lista.remove(persona);
                //Es necesario el break para reordenar la linkedList luego de eliminar
                //un elemento
                break;
            }
        }
        // Recorremos con un forEach
        for( Persona persona : lista) {
            System.out.println(persona.getNombre());
        }
    }
}
