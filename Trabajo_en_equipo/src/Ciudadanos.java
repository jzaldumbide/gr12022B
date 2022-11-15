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

    /*METODO*/
    public void Flores(Ciudadanos Ciudadano2){
        //Asignación de datos
        Ciudadano2.setNombre("Dilan Flores");
        Ciudadano2.setEdad(20);
        Ciudadano2.setCedula("1727936070");
        Ciudadano2.setEstado_civil("Soltero");
        Ciudadano2.setNombre_github("dilan-flores");

        //Presentación de ciudadano 2
        System.out.println("        Ciudadano 2");
        System.out.println("Nombre: " + Ciudadano2.getNombre());
        System.out.println("Edad: " + Ciudadano2.getEdad());
        System.out.println("C.I: " + Ciudadano2.getCedula());
        System.out.println("Estado civil: " + Ciudadano2.getEstado_civil());
        System.out.println("GitHub: " + Ciudadano2.getNombre_github());
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
