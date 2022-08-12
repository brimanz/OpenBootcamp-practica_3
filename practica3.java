public class Main {
    public static void main(String args[]) {
      
      Persona persona1 = new Persona();
      
      persona1.setEdad(33);
      System.out.println("La edad de persona1 es: " + persona1.getEdad());
      
      persona1.setNombre("Jon");
      System.out.println("El nombre de persona1 es: " + persona1.getNombre());
      
      persona1.setTelefono("45678921");
      System.out.println("El nuemro de telefono de persona1 es: " + persona1.getTelefono());
    }
    
    
    public static class Persona{
        private int edad;
        private String nombre;
        private String telefono;
        
        
        //seting values
        public void setEdad(int edad){
            this.edad = edad;
        }
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        
        
        //geting values
        public int getEdad(){
            return this.edad;
        }
        
        public String getNombre(){
            return this.nombre;
        }
        
        public String getTelefono(){
            return this.telefono;
        }
        
    }
}