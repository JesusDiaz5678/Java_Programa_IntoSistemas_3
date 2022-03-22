import java.util.Scanner;

public class miPrograma{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema:");
        
        System.out.println("Ingrese su nombre: ");
        String name = in.next();
        
        
        System.out.println("Marque 1 si es Hombre, 2 Mujer, 3 Otro: ");

        try{
            int sexo = in.nextInt();
            switch(sexo){

                case 1 : System.out.println("Bienvenido al Sistema " + name);  break;
                case 2 : System.out.println("Bienvenida al Sistema " + name);  break;
                case 3 : System.out.println("BienvenidE al Sistema " + name);  break;
                default : System.out.println("Que sos entonces..." + name);  break;
            }
        }
        catch(Exception exception){
            System.out.println("te pedi un numero... ahora eres mujer");
            System.out.println("Bienvenida al Sistema " + name);
        }

        System.out.println("Elige una de las opciones del menu:");
        System.out.println("1. Signo Sodiacal Segun tu cumpleaños.");
        System.out.println("2. Tu edad si fueras perro.");
        System.out.println("3. Dias Vividos.");
        System.out.println("4. Numerologia.");

        int opcion = in.nextInt();

        switch (opcion){

            case 1: {

                System.out.println("Haz elegido Signo Zodiacal");
                System.out.println("Por favor ingresa el mes de tu nacimiento:");
                System.out.println("");
                 
                int mes = in.nextInt();

                switch(mes){

                }

            }



        }

        
        








    }
}
