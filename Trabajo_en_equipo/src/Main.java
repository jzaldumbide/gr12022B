import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        //bucle para comenzar el menu
        while(!salir){
            System.out.println("1.- Persona 1");
            System.out.println("2.- Persona 2");
            System.out.println("3.- Persona 3");
            System.out.println("4.- Persona 4");
            System.out.println("5.- Persona 5");
            System.out.println("6.-Persona 6");
            System.out.println("7.-Persona 7");
            System.out.println("8.-Persona 8");
            System.out.println("8.-Persona 9");
            System.out.println("10.- Persona 10");
            System.out.println("11.- Persona 11");
            System.out.println("12.- Persona 12");
            System.out.println("13.-Salir");
            System.out.println("Introduce el numero que de deseas saber de la persona");
            opcion = sn.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    Ciudadanos ciudadano8 = new Ciudadanos();
                    ciudadano8.setNombre("Josue Salazar");
                    ciudadano8.setEdad(20);
                    ciudadano8.setCedula("1723359327");
                    ciudadano8.setEstado_civil("Soltero");
                    ciudadano8.setNombre_github("JosueSalazar7");

                    System.out.println("\tCiudadano 8");
                    System.out.println("Nombre: " +ciudadano8.getNombre() );
                    System.out.println("Edad: " +ciudadano8.getEdad() );
                    System.out.println("C.I.: " + ciudadano8.getCedula() );
                    System.out.println("Estado Civil: " + ciudadano8.getEstado_civil() );
                    System.out.println("Github: " + ciudadano8.getNombre_github() );
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    Ciudadanos ciudadano11 = new Ciudadanos();
                    ciudadano11.setNombre("Marlon Lalangui");
                    ciudadano11.setEdad(19);
                    ciudadano11.setCedula("172602504-0");
                    ciudadano11.setEstado_civil("Soltero");
                    ciudadano11.setNombre_github("marlon1925");

                    System.out.println("\tCiudadano 3");
                    System.out.println("Nombre: " +ciudadano11.getNombre() );
                    System.out.println("Edad: " +ciudadano11.getEdad() );
                    System.out.println("C.I.: " + ciudadano11.getCedula() );
                    System.out.println("Estado Civil: " + ciudadano11.getEstado_civil() );
                    System.out.println("Github: " + ciudadano11.getNombre_github() );
                    break;
                case 12:
                    break;
                case 13:
                    salir = true;
                    break;
                default:
                    System.out.println("las opciones estan entre 1 y 13");
            }

        }


    }
}