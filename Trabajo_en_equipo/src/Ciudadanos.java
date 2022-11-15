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
    

    //METHODS 
    public void David(Ciudadanos Name){
        System.out.println("\tejercicio GitHub");
        System.out.println("Nombre: " +Name.getNombre() );
        System.out.println("Edad: " +Name.getEdad() );
        System.out.println("C.I.: " + Name.getCedula() );
        System.out.println("Estado Civil: " + Name.getEstado_civil() );
        System.out.println("Github: " + Name.getNombre_github() );
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

    //Method 
   
    

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
