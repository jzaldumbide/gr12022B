import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        //Ciudadano 2
        Ciudadanos Ciudadano2 = new Ciudadanos();
        Ciudadanos ciudadano_7 = new Ciudadanos();

        //objeto 1
        Ciudadanos ciudadano_1 = new Ciudadanos();


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

                    ciudadano_1.setNombre("José Pinos");
                    ciudadano_1.setEdad(21);
                    ciudadano_1.setCedula("172690813-8");
                    ciudadano_1.setEstado_civil("Soltero");
                    ciudadano_1.setNombre_github("JosePinos 1) J-Pinos3 2)");

                    System.out.println("\tCiudadano 1");
                    System.out.println("Nombre: " +ciudadano_1.getNombre() );
                    System.out.println("Edad: " +ciudadano_1.getEdad() );
                    System.out.println("C.I.: " + ciudadano_1.getCedula() );
                    System.out.println("Estado Civil: " + ciudadano_1.getEstado_civil() );
                    System.out.println("Github: " + ciudadano_1.getNombre_github() );

                    break;
                case 2:
                    // Asignación de datos
                    Ciudadano2.setNombre("Dilan Flores");
                    Ciudadano2.setEdad(29);
                    Ciudadano2.setCedula("1727936070");
                    Ciudadano2.setEstado_civil("Soltero");
                    Ciudadano2.setNombre_github("dilan-flores");

                    //Presentación de ciudadano 2
                    System.out.println("Ciudadano 2");
                    System.out.println("Nombre: " + Ciudadano2.getNombre());
                    System.out.println("Edad: " + Ciudadano2.getEdad());
                    System.out.println("C.I: " + Ciudadano2.getCedula());
                    System.out.println("Estado civil: " + Ciudadano2.Estado_civil);
                    System.out.println("GitHub: " + Ciudadano2.Nombre_github);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    ciudadano_5.setNombre("Edison Morales");
                    ciudadano_5.setEdad(18);
                    ciudadano_5.setCedula("1727267674");
                    ciudadano_5.setEstado_civil("Soltero");
                    ciudadano_5.setNombre_github("ZEROo666");
                    mostrarCiudadanos(ciudadano_5);

                    System.out.println("Ciudadano 5");
                    System.out.println("Nombre: " + ciudadano_5.getNombre());
                    System.out.println("Edad: " + ciudadano_5.getEdad());
                    System.out.println("C.I: " + ciudadano_5.getCedula());
                    System.out.println("Estado civil: " + Ciudadano_5.Estado_civil);
                    System.out.println("GitHub: " + Ciudadano_5.Nombre_github);
                    System.out.println("Ejercicio Github");
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
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