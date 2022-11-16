public class Ciudadanos {
    //ATTRIBUTES
    String Nombre;
    int edad;
    String Cedula;
    String Estado_civil;
    String Nombre_github;

    //CONSTRUCTOR
    public void Ciudadanos (){
        Nombre = "Pepe";
        edad = 12;
        Cedula = "1111111";
        Estado_civil = "Soltero";
        Nombre_github  = "Nosexd";
    }

    public void  metodoLalangui(Ciudadanos ciudadano11){

        System.out.println("\tCiudadano  11");
        System.out.println("\n\tEjercicio GitHub");
        System.out.println("Nombre: " + ciudadano11.getNombre() );
        System.out.println("Edad: " + ciudadano11.getEdad() );
        System.out.println("C.I.: " + ciudadano11.getCedula() );
        System.out.println("Estado Civil: " + ciudadano11.getEstado_civil() );
        System.out.println("Github: " + ciudadano11.getNombre_github() );

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
