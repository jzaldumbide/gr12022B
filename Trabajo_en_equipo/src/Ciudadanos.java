public class Ciudadanos {
    //ATTRIBUTES
    String Nombre;
    int edad;
    String Cedula;
    String Estado_civil;
    String Nombre_github;

    //CONSTRUCTOR
    public Ciudadanos(){
        Nombre = "Pepe";
        edad = 12;
        Cedula = "1111111";
        Estado_civil = "Soltero";
        Nombre_github  = "Nosexd";
    }

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
