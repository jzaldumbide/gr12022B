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
                    break;
                case 9:
                    Ciudadanos Ciudadano9= new Ciudadanos();

                    Ciudadano9.setNombre("Katherine Cangahuamin");
                    Ciudadano9.setEdad(23;
                    Ciudadano9.setEstado_civil("Soltero");
                    Ciudadano9.setNombre_github("kathycan27");
                    Ciudadano9.setCedula("1727664599");

                    System.out.println("\n\tCiudadano #9");
                    System.out.println("Nombre: " + Ciudadano9.getNombre());
                    System.out.println("Edad: " + Ciudadano9.getEdad());
                    System.out.println("C.I.: " + Ciudadano9.getCedula());
                    System.out.println("Estado Civil: " + Ciudadano9.getEstado_civil());
                    System.out.println("Github: " + Ciudadano9.getNombre_github());

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