import java.io.BufferedReader;
import java.io.FileReader;

public class MainApp {

    public static void main(String args[]){

        int status;
        if(args.length == 0){
            System.out.println("Falta el nombre del archiivo");
            System.exit(1)
        }

        String fileName = args[0];

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e){
            System.out.println("El nombre del archivo no se encuentra");
            System.exit(2);

        }

        BufferedReader in = new BufferedReader(fileReader);

        String textline = null;
        int contador= 0;
        while (true){
            try{
                if(!((textline = in.read()) !=null))
                    break;
            } catch (IDException e){
                System.out.println("Error al leer el archivo de entrada");
                System.exit(3);
            }
            contador++;
        }
        try {
            in.close();
        }catch (IDException e ){
            e.printStackTrace();
        }

        System.out.println("El archivo" + fileName + " tiene "+ contador +" lineas");

    }
}
