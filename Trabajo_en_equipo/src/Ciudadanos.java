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

    public void metodoEdison_Morales () {
        Ciudadanos Edison_Morales = new Ciudadanos();
        Edison_Morales.setNombre("Edison Morales");
        Edison_Morales.setEdad(23);
        Edison_Morales.setCedula("1727267674");
        Edison_Morales.setEstado_civil("Soltero");
        Edison_Morales.setNombre_github("ZEROo666");
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
