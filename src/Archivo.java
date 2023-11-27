
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

    // para guardar los datos en un txt

   // static PrintWriter out;

   // static {
      //  try {
          //  out = new PrintWriter("datos.txt");
      //  } catch (FileNotFoundException e) {
      //      throw new RuntimeException(e);
     //   }
   // }


    public static void guardar(){

        try{
            PrintWriter out = new PrintWriter("datos");
            out.println("xd");
            out.close();

        } catch (FileNotFoundException e){
            System.out.println("XD");
        }




        //for (int i = 0; i <Main.AlumnosLista.size() ; i++) {

         //   out.println(Main.AlumnosLista.get(i).toString());

      //  }






    }

}
