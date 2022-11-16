import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        //Ciudadano 2
        Ciudadanos Ciudadano2 = new Ciudadanos();
        Ciudadanos ciudadano_5 = new Ciudadanos();
        Ciudadanos ciudadano_7 = new Ciudadanos();
        Ciudadanos ciudadano_6 = new Ciudadanos();
        //objeto 1
        Ciudadanos ciudadano_1 = new Ciudadanos();
        Ciudadanos Ciudadano12 = new Ciudadanos();
        //ciudadano 3
        Ciudadanos ciudadano3 = new Ciudadanos();
        Ciudadanos Basantes = new Ciudadanos();
    //objeto 11
        Ciudadanos ciudadano_11 = new Ciudadanos();
        //bucle para comenzar el menu
        while(!salir){
            System.out.println("\n1.- Persona 1");
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
            System.out.print("Introduce el numero que de deseas saber de la persona: ");
            opcion = sn.nextInt();
            switch (opcion){
                case 1:

                    ciudadano_1.setNombre("José Pinos");
                    ciudadano_1.setEdad(21);
                    ciudadano_1.setCedula("172690813-8");
                    ciudadano_1.setEstado_civil("Soltero");
                    ciudadano_1.setNombre_github("JosePinos 1) J-Pinos3 2)");
                    ciudadano_1.Pinos();

                    break;
                case 2:
                    // Asignación de datos
                    Ciudadano2.setNombre("Dilan Flores");
                    Ciudadano2.setEdad(29);
                    Ciudadano2.setCedula("1727936070");
                    Ciudadano2.setEstado_civil("Soltero");
                    Ciudadano2.setNombre_github("dilan-flores");

                    //Presentación de ciudadano 2
                    
                    break;
                case 3:

                    ciudadano3.setNombre("Roberto Shiao");
                    ciudadano3.setEdad(20);
                    ciudadano3.setCedula("175136124-5");
                    ciudadano3.setEstado_civil("Soltero");
                    ciudadano3.setNombre_github("Shiao-Li");

                    ciudadano3.metodoShiao(ciudadano3);
                    break;
                case 4:
                    break;
                case 5:
                    //Cambio de los datos originales
                    ciudadano_5.setNombre("Edison Morales");
                    ciudadano_5.setEdad(18);
                    ciudadano_5.setCedula("1727267674");
                    ciudadano_5.setEstado_civil("Soltero");
                    ciudadano_5.setNombre_github("ZEROo666");
                    
                    break;
                case 6:
                    ciudadano_6.setNombre("Elian Moreira");
                    ciudadano_6.setEdad(19);
                    ciudadano_6.setCedula("1750875682");
                    ciudadano_6.setEstado_civil("Soltero");
                    ciudadano_6.setNombre_github("Elian027");
                    ciudadano_6.metodoMoreira(ciudadano_6);
                    break;
                case 7:
                    ciudadano_7.setNombre("Danny Vinueza");
                    ciudadano_7.setEdad(20);
                    ciudadano_7.setCedula("1752681474");
                    ciudadano_7.setEstado_civil("Soltero");
                    ciudadano_7.setNombre_github("DannyVinueza");
                    ciudadano_7.metodoVinueza(ciudadano_7);
                    //mostrarCiudadanos(ciudadano_7);
                    break;
                case 8:
                    Ciudadanos Ciudadano8 = new Ciudadanos();

                    //Seteamos los datos del Ciudadano
                    Ciudadano8.setNombre("Néstor Chumania");
                    Ciudadano8.setEdad(20);
                    Ciudadano8.setEstado_civil("Soltero");
                    Ciudadano8.setNombre_github("RotsenCH");
                    Ciudadano8.setCedula("1751354422");
                    Ciudadano8.metodoChumania(Ciudadano8);
                    break;
                case 9:
                    Ciudadanos ciudadano9 = new Ciudadanos();
                    ciudadano9.Salazar();


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

                    ciudadano11.Lalangui();
                    break;
                case 12:
                    //Cambio de los datos originales
                    Ciudadano12.setNombre("David");
                    Ciudadano12.setEdad(20);
                    Ciudadano12.setEstado_civil("soltero");
                    Ciudadano12.setNombre_github("DAVIDS2405");
                    Ciudadano12.setCedula("1750974550");
                    //Presentacion de datos
                    Basantes.Basantes12();                    
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