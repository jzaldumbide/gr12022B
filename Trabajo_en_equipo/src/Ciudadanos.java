public class Ciudadanos {
    //ATTRIBUTES
    String Nombre;
    int edad;
    String Cedula;
    String Estado_civil;
    String Nombre_github;

    //CONSTRUCTOR

    public void Ciudadanos1(){

        Nombre = "Pepe";
        edad = 12;
        Cedula = "1111111";
        Estado_civil = "Soltero";
        Nombre_github  = "Nosexd";
    }
    

    //METHODS 
    public void metodoVinueza(Ciudadanos nomCiu){
        System.out.println("\tejercicio GitHub");
        System.out.println("Nombre: " +nomCiu.getNombre() );
        System.out.println("Edad: " +nomCiu.getEdad() );
        System.out.println("C.I.: " + nomCiu.getCedula() );
        System.out.println("Estado Civil: " + nomCiu.getEstado_civil() );
        System.out.println("Github: " + nomCiu.getNombre_github() );
    }

    public void metodoChumania( Ciudadanos nestor){
        System.out.println("\t\nEjercicio GitHub");
        System.out.println("Nombre: " +nestor.getNombre() );
        System.out.println("Edad: " +nestor.getEdad() );
        System.out.println("C.I.: " + nestor.getCedula() );
        System.out.println("Estado Civil: " + nestor.getEstado_civil() );
        System.out.println("Github: " + nestor.getNombre_github() );
    }
    public void  metodoShiao(Ciudadanos ciudadano3){

        System.out.println("\tCiudadano  3");
        System.out.println("\n\tEjercicio GitHub");
        System.out.println("Nombre: " + ciudadano3.getNombre() );
        System.out.println("Edad: " + ciudadano3.getEdad() );
        System.out.println("C.I.: " + ciudadano3.getCedula() );
        System.out.println("Estado Civil: " + ciudadano3.getEstado_civil() );
        System.out.println("Github: " + ciudadano3.getNombre_github() );
    }
    
    
    
    public void Basantes12(){
        Ciudadanos Basantes1 = new Ciudadanos();
        Basantes1.setNombre("David");
        Basantes1.setEdad(20);
        Basantes1.setEstado_civil("soltero");
        Basantes1.setNombre_github("DAVIDS2405");
        Basantes1.setCedula("1750974550");

        System.out.println("\tejercicio GitHub");
        System.out.println("Nombre: " +Basantes1.getNombre() );
        System.out.println("Edad: " +Basantes1.getEdad() );
        System.out.println("C.I.: " + Basantes1.getCedula() );
        System.out.println("Estado Civil: " + Basantes1.getEstado_civil() );
        System.out.println("Github: " + Basantes1.getNombre_github() );
    }

    public void Pinos(){
        Ciudadanos Pinos1 = new Ciudadanos();
        System.out.println("\tCiudadano 1");
        System.out.println("Nombre: " + Pinos1.getNombre());
        System.out.println("Edad: " + Pinos1.getEdad());
        System.out.println("C.I.: " + Pinos1.getCedula());
        System.out.println("Estado Civil: " + Pinos1.getEstado_civil());
        System.out.println("Github: " + Pinos1.getNombre_github());
        System.out.println("Ejercicio en Github");

    }
    public void Lalangui(){
        Ciudadanos Lalangui11 = new Ciudadanos();
        System.out.println("\tCiudadano 11");
        System.out.println("Nombre: " + Lalangui11.getNombre());
        System.out.println("Edad: " + Lalangui11.getEdad());
        System.out.println("C.I.: " + Lalangui11.getCedula());
        System.out.println("Estado Civil: " + Lalangui11.getEstado_civil());
        System.out.println("Github: " + Lalangui11.getNombre_github());
        System.out.println("Ejercicio en Github");
    }
    public void Salazar(){
        Ciudadanos Salazar9 = new Ciudadanos();
        Salazar9.setNombre("Josue Salazar");
        Salazar9.setEdad(20);
        Salazar9.setEstado_civil("Soltero");
        Salazar9.setNombre_github("JosueSalazar7");
        Salazar9.setCedula("1723359327");


        System.out.println("\tejercicio GitHub");
        System.out.println("Nombre: " +Salazar9.getNombre() );
        System.out.println("Edad: " +Salazar9.getEdad() );
        System.out.println("C.I.: " + Salazar9.getCedula() );
        System.out.println("Estado Civil: " + Salazar9.getEstado_civil() );
        System.out.println("Github: " + Salazar9.getNombre_github() );
    }

    public void metodoMoreira (Ciudadanos em) {
        System.out.println("Nombre: "+em.getNombre());
        System.out.println("Edad: "+em.getEdad());
        System.out.println("Cedula: "+em.getCedula());
        System.out.println("Estado civil: "+em.getEstado_civil());
        System.out.println("Usuario Github: "+em.getNombre_github());
    }

    //GETTER AND SETTER

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getEstado_civil() {
        return Estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        Estado_civil = estado_civil;
    }

    public String getNombre_github() {
        return Nombre_github;
    }

    public void setNombre_github(String nombre_github) {
        Nombre_github = nombre_github;
    }
}
