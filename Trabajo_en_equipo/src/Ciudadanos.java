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

    public void metodoMoreira () {
        Ciudadanos em = new Ciudadanos();
        em.setNombre("Elian Moreira");
        System.out.println("Nombre: "+em.getNombre());
        em.setEdad(19);
        System.out.println("Edad: "+em.getEdad());
        em.setCedula("1750875682");
        System.out.println("Cedula: "+em.getCedula());
        em.setEstado_civil("Soltero");
        System.out.println("Estado civil: "+em.getEstado_civil());
        em.setNombre_github("Elian027");
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
