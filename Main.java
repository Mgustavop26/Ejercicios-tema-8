public class Main {
    public static void main(String args[]){
       Persona persona= new Persona();
        System.out.println("Nombre " + " Edad " + " Telefono ");
       System.out.println(persona.getNombre()+"  "+ persona.getEdad()+"  "+ persona.getTelefono());
       Persona persona2 = new Persona("Pedro",25,"11425374");
        System.out.println(persona2.getNombre()+"  "+ persona2.getEdad()+"  "+ persona2.getTelefono());
        Persona persona3 = new Persona();
        persona3.setNombre("Antonio");
        persona3.setEdad(28);
        persona3.setTelefono("12234567");
        System.out.println(persona3.getNombre()+"  "+ persona3.getEdad()+"  "+ persona3.getTelefono());
    }
}
