public class ciudadanos {
    /*atributos*/
    String Nombre;
    byte edad;
    String cedula;
    String estado_civil;


    public void ciudadanos(){
        Nombre = "David Basantes";
        edad = -99;
        cedula = "10101010";
        estado_civil = "solito";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
}