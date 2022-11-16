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
