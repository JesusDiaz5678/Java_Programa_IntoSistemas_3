import java.io.ObjectInputFilter.Status;
import java.sql.Array;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class miPrograma{
    public static void main(String[] args) {
        
        int exit = 0;
        Scanner in = new Scanner(System.in);

        System.out.println(" \n \n Ingrese su nombre: ");
        System.out.println("");

        String name = in.nextLine();

        System.out.println("");
        System.out.println("Marque 1 si es Hombre, 2. Mujer, 3. Otro: ");
        System.out.println("");

        String sexo = in.nextLine();
        switch(sexo){

            case "1" : System.out.println(""); System.out.println("Bienvenido al Sistema " + name + ".");  break;
            case "2" : System.out.println(""); System.out.println("Bienvenida al Sistema " + name + ".");  break;
            case "3" : System.out.println(""); System.out.println("BienvenidE al Sistema " + name + ".");  break;
            default : System.out.println(""); System.out.println("Que sos entonces...?? " + name + ".");  break;
        }
        
        System.out.println("Elige una de las opciones del menu:");
        System.out.println("");

        System.out.println("1. Signo Zodiacal Segun tu cumpleaños.");
        System.out.println("2. Tu edad si fueras perro.");
        System.out.println("3. Dias Vividos.");
        System.out.println("4. Numerologia.");
        System.out.println("");
        
        int iopcion = 0;

        try {
            int opcion = in.nextInt();
            iopcion = opcion;
        }
        catch(Exception e){

            System.out.println("");
            System.out.println("Haz digitado un valor invalido.");
            System.out.println("El sistema se reiniciara autoamricamente");
            System.exit(exit);
        }

        switch (iopcion){

            case (1) : {

                System.out.println("");
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
                    System.out.println("Haz digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }

                switch(imes){
                    case (1) :{

                        System.out.println("En que Dia de Enero?");
                        System.out.println("");
                        
                        try {

                            int dia = in.nextInt();

                            if (dia > 0 && dia < 21){

                                System.out.println("");
                                System.out.println("Tu signo es CAPRICORNIO:");
                                System.out.println("");
                                System.out.println("CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");  

                            }else if (dia > 21 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es ACUARIO:");
                                System.out.println("");
                                System.out.println("ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(2) : {
                        
                        System.out.println("En que Dia de Febrero?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 20){

                                System.out.println("");
                                System.out.println("Tu signo es ACUARIO:");
                                System.out.println("");
                                System.out.println("ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");  

                            }else if (dia > 21 && dia < 29){

                                System.out.println("");
                                System.out.println("Tu signo es PISCIS:");
                                System.out.println("");
                                System.out.println("PISCIS es un signo mutable y de agua, también es el último signo del zodiaco,       precisamente por eso, es el más rico y complejo de todos. Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(3) : {
                        
                        System.out.println("En que Dia de Marzo?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 21){

                                System.out.println("");
                                System.out.println("Tu signo es PISCIS:");
                                System.out.println("");
                                System.out.println("PISCIS es un signo mutable y de agua, también es el último signo del zodiaco,       precisamente por eso, es el más rico y complejo de todos. Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia."); 

                            }
                            else if (dia > 21 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es ARIES:");
                                System.out.println("");
                                System.out.println("ARIES forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; también es el primer signo del zodíaco, precisamente por eso, simboliza el inicio, la creación. Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(4) : {
                        
                        System.out.println("En que Dia de Abril?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 21){

                                System.out.println("");
                                System.out.println("Tu signo es ARIES:");
                                System.out.println("");
                                System.out.println("ARIES forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; también es el primer signo del zodíaco, precisamente por eso, simboliza el inicio, la creación. Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");

                            }
                            else if (dia > 20 && dia < 31){

                                System.out.println("");
                                System.out.println("Tu signo es TAURO:");
                                System.out.println("");
                                System.out.println("TAURO pertenece a los signos fijos y simultáneamente es un signo de tierra. La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(5) : {
                        
                        System.out.println("En que Dia de Mayo?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 22){

                                System.out.println("");
                                System.out.println("Tu signo es TAURO:");
                                System.out.println("");
                                System.out.println("TAURO pertenece a los signos fijos y simultáneamente es un signo de tierra. La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");

                            }
                            else if (dia > 21 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es GEMINIS:");
                                System.out.println("");
                                System.out.println("GEMINIS es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(6) : {
                        
                        System.out.println("En que Dia de Junio?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 22){

                                System.out.println("");
                                System.out.println("Tu signo es GEMINIS:");
                                System.out.println("");
                                System.out.println("GEMINIS es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");

                            }
                            else if (dia > 21 && dia < 31){

                                System.out.println("");
                                System.out.println("Tu signo es CANCER:");
                                System.out.println("");
                                System.out.println("CANCER Los nacidos bajo el signo de cáncer son personas completamente emocionales, muy sentimentales, imaginativos, cariñosos, protectores y muy sensuales. A la vez, pueden ser tímidos y muy sensibles, pero excelentes amantes. Es un signo muy divertido, amigable y confiado."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(7) : {
                        
                        System.out.println("En que Dia de Julio?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 23){

                                System.out.println("");
                                System.out.println("Tu signo es CANCER:");
                                System.out.println("");
                                System.out.println("CANCER Los nacidos bajo el signo de cáncer son personas completamente emocionales, muy sentimentales, imaginativos, cariñosos, protectores y muy sensuales. A la vez, pueden ser tímidos y muy sensibles, pero excelentes amantes. Es un signo muy divertido, amigable y confiado."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");

                            }
                            else if (dia > 22 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es LEO:");
                                System.out.println("");
                                System.out.println("LEO El signo de Leo es fijo y de fuego, también el signo más dominante del zodíaco. Creativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(8) : {
                        
                        System.out.println("En que Dia de Agosto?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 24){

                                System.out.println("");
                                System.out.println("Tu signo es LEO:");
                                System.out.println("");
                                System.out.println("LEO El signo de Leo es fijo y de fuego, también el signo más dominante del zodíaco. Creativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");

                            }
                            else if (dia > 22 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es VIRGO:");
                                System.out.println("");
                                System.out.println("VIRGO es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(9) : {
                        
                        System.out.println("En que Dia de Septiembre?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 24){

                                System.out.println("");
                                System.out.println("Tu signo es VIRGO:");
                                System.out.println("");
                                System.out.println("VIRGO es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su espíritu crítico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");

                            }
                            else if (dia > 23 && dia < 31){

                                System.out.println("");
                                System.out.println("Tu signo es LIBRA:");
                                System.out.println("");
                                System.out.println("LIBRA es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(10) : {
                        
                        System.out.println("En que Dia de Octubre?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 24){

                                System.out.println("");
                                System.out.println("Tu signo es LIBRA:");
                                System.out.println("");
                                System.out.println("LIBRA es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else if (dia > 23 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es ESCORPIO:");
                                System.out.println("");
                                System.out.println("ESCORPIO es un signo fijo y de agua; su potencia y energía emocional son únicas en todo el zodíaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(11) : {
                        
                        System.out.println("En que Dia de Noviembre?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 23){

                                System.out.println("");
                                System.out.println("Tu signo es ESCORPIO:");
                                System.out.println("");
                                System.out.println("ESCORPIO es un signo fijo y de agua; su potencia y energía emocional son únicas en todo el zodíaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else if (dia > 22 && dia < 31){

                                System.out.println("");
                                System.out.println("Tu signo es SAGITARIO:");
                                System.out.println("");
                                System.out.println("SAGITARIO es un signo zodiacal muy honesto, fiel en el amor pero también muy temperamental. Un Sagitario es para siempre hasta que se le traiciona. Optimistas, positivos, modestos, sinceros y simpáticos, los Sagitario (22 noviembre al 21 diciembre) suelen ser la alegría de la huerta del zodiaco."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                    case(12) : {
                        
                        System.out.println("En que Dia de Diciembre?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 23){

                                System.out.println("");
                                System.out.println("Tu signo es SAGITARIO:");
                                System.out.println("");
                                System.out.println("SAGITARIO es un signo zodiacal muy honesto, fiel en el amor pero también muy temperamental. Un Sagitario es para siempre hasta que se le traiciona. Optimistas, positivos, modestos, sinceros y simpáticos, los Sagitario (22 noviembre al 21 diciembre) suelen ser la alegría de la huerta del zodiaco."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else if (dia > 22 && dia < 32){

                                System.out.println("");
                                System.out.println("Tu signo es CAPRICORNIO:");
                                System.out.println("");
                                System.out.println("CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zodíaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancolía."); 
                                System.out.println("");
                                System.out.println("Gracias por usar nuestro sistema. Feliz Dia.");
                            }
                            else{
                                System.out.println("");
                                System.out.println("Haz digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara autoamricamente ");
                                System.exit(exit);
                            }
                        }                        
                        catch(Exception e){

                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }break;
                }   


            }break;
            case (2) : {

                System.out.println("");
                System.out.println("Haz ingresado: Tu edad si fueras Perro.");
                System.out.println("");
                System.out.println("Por favor digite su edad. (en años)");
                System.out.println("");

                int iedad = 0;
                int edadPerro = 0;

                try {

                    int edad = in.nextInt();
                    iedad = edad;
                } 
                catch (Exception e) {
                    
                    System.out.println("");
                    System.out.println("Haz digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }

                edadPerro = iedad * 7;

                System.out.println("");
                System.out.println("Gracias por sus datos " + name + ".");
                System.out.println(name + " Tu edad si fueras un perro seria: ");
                System.out.println(edadPerro + "Años.");

            }break;
            case (3) : {

                int anioActual = LocalDate.now().getYear();
                int mesActual = LocalDate.now().getMonthValue();
                int diaActual = LocalDate.now().getDayOfMonth();
                
                int diasMesActual = 0;

                int iAnioNacimiento = 0;
                int iMesNacimiento = 0;
                int iDiaNacimiento = 0;
                int diasMesNacimieto = 0;

                switch(mesActual){

                    case 1 : diasMesActual = 0; break;
                    case 2 : diasMesActual = 31; break;
                    case 3 : diasMesActual = 31 + 28; break;
                    case 4 : diasMesActual = 31 + 28 + 31; break;
                    case 6 : diasMesActual = 31 + 28 + 31 + 30; break;
                    case 7 : diasMesActual = 31 + 28 + 31 + 30 + 31; break;
                    case 8 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30; break;
                    case 9 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31; break;
                    case 10 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30; break;
                    case 11 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31; break;
                    case 12 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30; break;
                }

                int diasHastaFechaActual = ((anioActual * 365) - 365)  + diasMesActual + diaActual;
                
                System.out.println("");
                System.out.println("Haz ingresado: Dias vividos.");
                System.out.println("");
                System.out.println(name + " Por favor ingrese el dia de su nacimiento");
                System.out.println("");

                try {

                    int diaNacimiento = in.nextInt();
                    iDiaNacimiento = diaNacimiento;
                } 
                catch (Exception e) {
                    
                    System.out.println("");
                    System.out.println("Haz digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }
                
                System.out.println("");
                System.out.println(name + " Por favor ingresa el mes de tu nacimiento:");
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
    
                try{
    
                int mes = in.nextInt();
                iMesNacimiento = mes;
    
                }
                catch(Exception e){
    
                    System.out.println("");
                    System.out.println("Haz digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }

                System.out.println("");
                System.out.println(name + " Por favor ingresa el año de tu nacimiento:");
                System.out.println("");
    
                try {
                
                int anioNacimiento = in.nextInt();
                iAnioNacimiento = anioNacimiento;
                }
                catch (Exception e) {
                    
                    System.out.println("");
                    System.out.println("Haz digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }    

                switch(iMesNacimiento){

                    case 1 : diasMesNacimieto = 0; break;
                    case 2 : diasMesNacimieto = 31; break;
                    case 3 : diasMesNacimieto = 31 + 28; break;
                    case 4 : diasMesNacimieto = 31 + 28 + 31; break;
                    case 6 : diasMesNacimieto = 31 + 28 + 31 + 30; break;
                    case 7 : diasMesNacimieto = 31 + 28 + 31 + 30 + 31; break;
                    case 8 : diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30; break;
                    case 9 : diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31; break;
                    case 10 : diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30; break;
                    case 11 : diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31; break;
                    case 12 : diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30; break;
                }
                
                int diasHastaFechaNacimieto = ((iAnioNacimiento * 365) - 365)  + diasMesNacimieto + iDiaNacimiento;

                int diasVividosTotales = diasHastaFechaActual - diasHastaFechaNacimieto;

                System.out.println("");
                System.out.println(name + " Muchas Gracias por tus Datos.");
                System.out.println("");
                System.out.println("Hasta la fecha han pasado: " + diasHastaFechaActual + " Dias. Desde el dia 0.");
                System.out.println("Pasaron " + diasHastaFechaNacimieto + " Dias antes de que tu nacieras.");
                System.out.println("");
                System.out.println("Deacuerdo con la informacion brindada la cantidad de dias que haz vivido desde el dia 0 es:");
                System.out.println("");                
                System.out.println(diasVividosTotales);

            }break;
            case (4) : {
                
                int ianioNacimientoNumerologia = 0;
                int iMesNacimientoNumerologia = 0;
                int idiaNacimietoNumerologia = 0;

                int[] arrayDigitosDias = new int[2]; 
                int[] arrayDigitosMes = new int[2]; 
                int[] arrayDigitosAnio = new int[4]; 
                int[] arrayNumParcial = new int [2];
                
                System.out.println("\nHaz ingresado: Numerologia.");
                
                do {

                    System.out.println("\n" + name + " Por favor ingrese el dia de su nacimiento \n");
                    try {
                        int diaNacimietoNumerologia = in.nextInt();
                        idiaNacimietoNumerologia = diaNacimietoNumerologia;
                    }    
                    catch (Exception e) {

                        System.out.println("\nHaz digitado un valor invalido.");
                        System.out.println("El sistema se reiniciara autoamricamente");
                        System.exit(exit);
                    } 

                }while(!(idiaNacimietoNumerologia > 0 && idiaNacimietoNumerologia < 32));

                if (idiaNacimietoNumerologia > 0 && idiaNacimietoNumerologia < 32){

                    do{
                        System.out.println("\n   Ingresa tu mes de nacimiento");

                        System.out.println("\n1. Enero");
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
                        System.out.println("12. Diciembre \n");

                        try{
                        
                            int mes = in.nextInt();
                            iMesNacimientoNumerologia = mes;

                        }
                        catch(Exception e){
                        
                            System.out.println("");
                            System.out.println("Haz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        }
                    }while(!(iMesNacimientoNumerologia > 0 && iMesNacimientoNumerologia < 13));

                    do{
                        System.out.println("");
                        System.out.println(name + " Por favor ingresa el año de tu nacimiento:");
                        System.out.println("");
                        
                        try {
                        
                        int anioNacimiento = in.nextInt();
                        ianioNacimientoNumerologia = anioNacimiento;
                        }
                        catch (Exception e) {

                            System.out.println("\nHaz digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara autoamricamente");
                            System.exit(exit);
                        } 
                    }while(!(ianioNacimientoNumerologia > 0 && ianioNacimientoNumerologia < LocalDate.now().getYear()));
                    
                    int estadoDiasNacmimiento = idiaNacimietoNumerologia;
                    int indexDia = 0;
                    
                    while ((int)estadoDiasNacmimiento != 0 ){

                        arrayDigitosDias[indexDia] = (int)estadoDiasNacmimiento % 10;
                        estadoDiasNacmimiento = (int)estadoDiasNacmimiento / 10;
                        indexDia++;
                    }

                    int estadoMesNacmimiento = iMesNacimientoNumerologia;
                    int indexMes = 0;
                    
                    while ((int)estadoMesNacmimiento != 0 ){

                        arrayDigitosMes[indexMes] = (int)estadoMesNacmimiento % 10;
                        estadoMesNacmimiento = (int)estadoMesNacmimiento / 10;
                        indexMes++;
                    }

                    int estadoAnioNacmimiento = ianioNacimientoNumerologia;
                    int indexAnio = 0;
                    
                    while ((int)estadoAnioNacmimiento != 0 ){

                        arrayDigitosAnio[indexAnio] = (int)estadoAnioNacmimiento % 10;
                        estadoAnioNacmimiento = (int)estadoAnioNacmimiento / 10;
                        indexAnio++;
                    }
                }

                else{

                    System.out.println("\nHaz digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }

                int numVidaParcial = arrayDigitosAnio[0] + arrayDigitosAnio[1] + arrayDigitosAnio[2] + arrayDigitosAnio[3] + arrayDigitosDias[0] + arrayDigitosDias[1] + arrayDigitosMes[0] + arrayDigitosMes[1];

                if (!(numVidaParcial > 0 && numVidaParcial < 10)){

                    int estadoNumParcial = numVidaParcial;
                    int indexNumParcial = 0;

                    System.out.println(estadoNumParcial);
                    
                    while ((int)estadoNumParcial != 0 ){

                        arrayNumParcial[indexNumParcial] = (int)estadoNumParcial % 10;
                        estadoNumParcial = (int)estadoNumParcial / 10;
                        indexNumParcial++;
                    }

                    System.out.println(arrayNumParcial[0]);
                    System.out.println(arrayNumParcial[1]);
                    System.out.println(estadoNumParcial);
                    System.out.println(numVidaParcial);


                    int numVida = arrayNumParcial[0] + arrayNumParcial[1];

                    System.out.println("");
                    System.out.println(name + " Muchas Gracias por tus Datos.");
    
                    System.out.println("\nDe acuerdo con los datos Proporcionados, tu numero de vida, segun la numerologia es: ");
                    System.out.println(numVida);

                }
                else{

                    System.out.println("");
                    System.out.println(name + " Muchas Gracias por tus Datos.");
    
                    System.out.println("\nDe acuerdo con los datos Proporcionados, tu numero de vida, segun la numerologia es: ");
                    System.out.println(numVidaParcial);
                }
            }
        }

    

        
        








    }
}
