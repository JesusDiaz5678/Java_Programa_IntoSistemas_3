import java.io.ObjectInputFilter.Status;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class miPrograma{
    public static void main(String[] args) {
        
        int exit = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema:");
        System.out.println("");
        
        System.out.println("Ingrese su nombre: ");
        System.out.println("");

        String name = in.nextLine();
        
        System.out.println("Marque 1 si es Hombre, 2. Mujer, 3. Otro: ");
        System.out.println("");

        String sexo = in.nextLine();
        switch(sexo){

            case "1" : System.out.println("Bienvenido al Sistema " + name);  break;
            case "2" : System.out.println("Bienvenida al Sistema " + name);  break;
            case "3" : System.out.println("BienvenidE al Sistema " + name);  break;
            default : System.out.println("Que sos entonces...?? " + name);  break;
        }
        
        System.out.println("");
        System.out.println("Elige una de las opciones del menu:");
        System.out.println("");

        System.out.println("1. Signo Zodiacal Segun tu cumpleaños.");
        System.out.println("2. Tu edad si fueras perro.");
        System.out.println("3. Dias Vividos.");
        System.out.println("4. Numerologia.");
        
        int iopcion = 0;

        try{
            int opcion = in.nextInt();
            iopcion = opcion;
        }
        catch(Exception e){

            System.out.println("");
            System.out.println("Haz digitado un numero invalido.");
            System.out.println("El sistema se reiniciara autoamricamente");
            System.exit(exit);
        }

        switch (iopcion){

            case 1: {

                System.out.println("Haz elegido Signo Zodiacal");
                System.out.println("Por favor ingresa el mes de tu nacimiento:");
                System.out.println("");

                System.out.println("1. Enero");
                System.out.println("2. Febrero");
                System.out.println("3. Marzo");
                System.out.println("4. Abril");
                System.out.println("5. Mayo");
                System.out.println("6. Junio");
                System.out.println("7. Julio");
                System.out.println("8. Agosto");
                System.out.println("9. Septiembre");
                System.out.println("10. Octubre");
                System.out.println("11. Noviembre");
                System.out.println("12. Diciembre");
                System.out.println("");
                 
                int imes = 0;

                try{

                int mes = in.nextInt();
                imes = mes;

                }
                catch(Exception e){

                    System.out.println("");
                    System.out.println("Haz digitado un numero invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }


                switch(imes){
                    case 1 :{

                        System.out.println("En que Dia de Enero?");
                        System.out.println("");
                        
                        try {

                            int diaEnero = in.nextInt();

                            if (diaEnero > 0 && diaEnero < 21){

                                System.out.println("");
                                System.out.println("Tu signo es CAPRICORNIO:");
                                System.out.println("");
                                System.out.println("CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");  

                            }else if (diaEnero > 21 && diaEnero < 32){

                                System.out.println("");
                                System.out.println("Tu signo es ACUARIO:");
                                System.out.println("");
                                System.out.println("ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }else{
                                System.out.println("");
                                System.out.println("Haz digitado un numero invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un numero invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }

                    }break;
                }
            }
        }

        
        








    }
}
