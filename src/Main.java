import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Alumno> AlumnosLista = new ArrayList<Alumno>();

    public static void main(String[] args)  {


        boolean menu = true;
        int actual = 0;

        while  (menu)   {

            System.out.println("MENU ADMINISTRACIÓN CLASE. ELIGE LA OPCION QUE DESEES.");
            System.out.println("-----------------------------------------------------");
            System.out.println("1: Introducir alumno");
            System.out.println("2: Editar alumno");
            System.out.println("3: Eliminar alumno");
            System.out.println("4: Mostrar alumnos");
            System.out.println("5: Archivo");
            System.out.println("-----------------------------------------------------");

            int opt = read.INT();

            switch (opt){

                case 1:

                    AlumnosLista.add(new Alumno());
                    System.out.println("Introduce la edad: ");
                    AlumnosLista.get(actual).setEdad(read.INT());
                    System.out.println("Introduce la posicion: ");
                    AlumnosLista.get(actual).setPosicion(read.INT());
                    System.out.println("Introduce el DNI: ");
                    read.STRING();
                    AlumnosLista.get(actual).setDNI(read.STRING());
                    System.out.println("Introduce el nombre: ");
                    AlumnosLista.get(actual).setNombre(read.STRING());
                    System.out.println("Introduce el apellido: ");
                    AlumnosLista.get(actual).setApellido(read.STRING());

                    System.out.println("Datos Introducidos, saliendo al menu principal.");
                    read.STRING();

                    actual++;
                    flush();

                    break;


                case 2:

                    break;

                case 3:

                    break;


                case 4:


                    for (int i = 0; i <AlumnosLista.size() ; i++) {

                        System.out.println(AlumnosLista.get(i).toString());

                    }

                    break;


                case 5:

                    Archivo.guardar();


                    break;

            }

        }




        }

    public static void flush(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    }
