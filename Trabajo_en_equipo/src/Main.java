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
                    Ciudadanos Ciudadano8 = new Ciudadanos();

                    //Seteamos los datos del Ciudadano
                    Ciudadano8.setNombre("Néstor Chumania");
                    Ciudadano8.setEdad(20);
                    Ciudadano8.setEstado_civil("Soltero");
                    Ciudadano8.setNombre_github("RotsenCH");
                    Ciudadano8.setCedula("1751354422");

                    //Mostramos en pantalla utilizando getters
                    System.out.println("\n\tCiudadano #8");
                    System.out.println("Nombre: " + Ciudadano8.getNombre());
                    System.out.println("Edad: " + Ciudadano8.getEdad());
                    System.out.println("C.I.: " + Ciudadano8.getCedula());
                    System.out.println("Estado Civil: " + Ciudadano8.getEstado_civil());
                    System.out.println("Github: " + Ciudadano8.getNombre_github());
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
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