
package LinkedList;

public class Persona {
   private int num;
   private String nombre;
   private int edad;

   public Persona(){

   }

   public Persona(int num, String nombre, int edad){
       this.num = num;
       this.nombre = nombre;
       this.edad = edad;
   }

   public int getNum(){
       return num;
   }
   
   public void setNum(int numero){
       this.num = numero;
   }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
