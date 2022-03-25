import java.io.ObjectInputFilter.Status;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.print.attribute.standard.DateTimeAtCompleted;

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

            case (1) : {

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
            case (2) : {

                System.out.println("");
                System.out.println("Haz ingresado: Tu edad si fueras Perro");
                System.out.println("");
                System.out.println("Por favor digite su edad. (en años)");

                int iedad = 0;
                int edadPerro = 0;

                try {

                    int edad = in.nextInt();
                    iedad = edad;
                } 
                catch (Exception e) {
                    
                    System.out.println("");
                    System.out.println("Haz digitado un numero invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }

                edadPerro = iedad * 7;

                System.out.println("");
                System.out.println("Gracias por sus datos " + name + ".");
                System.out.println("");
                System.out.println(name + " Tu edad si fueras un perro seria: " + edadPerro + " Años");
            }
            case (3) : {

                int anioActual = LocalDate.now().getYear();
                int mesActual = LocalDate.now().getMonthValue();
                int diaActual = LocalDate.now().getDayOfMonth();
                int diasMesActual = 0;

                switch(mesActual){

                    case 1 : diasMesActual = 0;
                    case 2 : diasMesActual = 31;
                    case 3 : diasMesActual = 31 + 28;
                    case 4 : diasMesActual = 31 + 28 + 31;
                    case 6 : diasMesActual = 31 + 28 + 31 + 30;
                    case 7 : diasMesActual = 31 + 28 + 31 + 30 + 31;
                    case 8 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30;
                    case 9 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                    case 10 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30;
                    case 11 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31;
                    case 12 : diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;
                }

                int diasHastaFechaActual = anioActual * 365 + diasMesActual + diaActual;

                System.out.println(diasHastaFechaActual);
                
                int iedad = 0;
                int diasEdad = 0;
                int imes = 0;
                int diasMes = 0;

                System.out.println("");
                System.out.println("Haz ingresado: Dias vividos");
                System.out.println("");
                System.out.println(name + " Por favor ingrese el año de su nacimiento");

                try {

                    int edad = in.nextInt();
                    iedad = edad;
                } 
                catch (Exception e) {
                    
                    System.out.println("");
                    System.out.println("Haz digitado un numero invalido.");
                    System.out.println("El sistema se reiniciara autoamricamente");
                    System.exit(exit);
                }

                diasEdad = iedad * 365;


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

            }
        }

    

        
        








    }
}
