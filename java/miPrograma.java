import java.io.ObjectInputFilter.Status;
import java.sql.Array;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class miPrograma {

    // ------------------------------------------funciones-----------------------------------------

    static void Numerologia(int vida) {

        if (vida == 1) {

            System.out.println(
                    "\n Regido por el Sol, este n\u00famero tiene que ver con la conciencia. Es un n\u00famero masculino. Su graf\u00eda un palito hacia arriba es como una antena que capta y baja la informaci\u00f3n. Est\u00e1 vinculado a la creatividad y refiere, adem\u00e1s, a los inicios, al punto de partida. Se lo suele vincular con aquel quien tiene la idea o dice qu\u00e9 hacer (la palabra). Si est\u00e1 mal aspectado, puede abusar de su autoridad.");

        } else if (vida == 2) {

            System.out.println(
                    "\n Regido por la Luna, este n\u00famero est\u00e1 relacionado con la nutrici\u00f3n, la empat\u00eda, la compasi\u00f3n y el servicio. Es un n\u00famero femenino. \t Algunos numer\u00f3logos sostienen que los dos se caracterizan por su sensibilidad y que, en su af\u00e1n de ayudar al otro, se dejan de lado a ellos mismos. Algunos dos pueden presentar dificultades para decir que no y para poner l\u00edmites.");

        } else if (vida == 3) {

            System.out.println(
                    "\n Bajo la regencia de Ju00fapiter, el tres representa el juego. Es arquetipo del ni\u00f1o y tiene que ver con abundancia y con la gestaci\u00f3n creativa: tiene habilidad para comunicar, pero tambi\u00e9n puede ser cantante o pintor. Tiene mucha influencia en la parte mental y en la social. Si est\u00e1 mal vibrado, puede ser disperso.");

        } else if (vida == 4) {

            System.out.println("\n Con la regencia de Urano y de Saturno, el cuatro es el arquetipo del pater familae. Protector, proveedor y l\u00edder, este n\u00famero representa el orden y la ley. Tiene que ver con la estabilidad, la seguridad y la responsabilidad. Anal\u00edtico y controlado.");

        } else if (vida == 5) {

            System.out.println("\n Mercurio rige a este n\u00famero, que se caracteriza por la inteligencia, la curiosidad y la velocidad. Por la raya ubicada arriba de su graf\u00eda, se lo considera r\u00edgido. Sin embargo, la panza de abajo es se\u00f1al de apertura. El cinco simboliza la libertad, la expansi\u00f3n, la originalidad y la energ\u00eda cambiante. Est\u00e1 vinculado a la diversidad y, por su relaci\u00f3n con el n\u00famero tres, es muy comunicativo.");

        } else if (vida == 6) {

            System.out.println("\n Con la regencia de Venus, el seis simboliza la idea de comunidad: el amor a la familia y la pertenencia al clan. Es un eterno buscador de armon\u00eda. El seis es diplom\u00e1tico y est\u00e1 siempre tratando de unir: ya sea el cielo y la tierra, la mente y el coraz\u00f3n. Es equilibrado y tiene gran afinidad con el arte, la m\u00fasica y la pl\u00e1stica.");

        } else if (vida == 7) {

            System.out.println("\n Neptuno rige a este n\u00famero cargado de sentido m\u00edstico. El siete oficia de médium. Tiene su percepci\u00f3n y su intuici\u00f3n hiperdesarrolladas y, por eso, tiene gran habilidad para captar todo lo que no se ve. Se inclina por todas aquellas actividades introspectivas, vinculadas con la religi\u00f3n, la meditaci\u00f3n, la espiritualidad, lo metaf\u00edsico.");

        } else if (vida == 8) {

            System.out.println("\n El dios del tiempo, Saturno, es el planeta regente de este n\u00famero. Representa el arquetipo del gobernante, el poder, los gobiernos instituciones del mundo, el orden del mundo, la ley y el orden. En su graf\u00eda, es como un tres, pero cerrado. El ocho supone el punto de uni\u00f3n entre lo espiritual y lo material.");

        } else if (vida == 9) {

            System.out.println("\n Tiene regencia doble. Por un lado, Neptuno y, por el otro, Plut\u00f3n, el dios de las profundidades. Es el arquetipo del gu\u00eda o del maestro; el nueve est\u00e1 vinculado con el amor a la humanidad, un tipo de sentimiento m\u00e1s despersonalizado.");

        } else if (vida == 10) {

            System.out.println("\n El diez tiene la regencia de Plut\u00f3n y lo acompaña ur\u00f3boros, la serpiente que se muerde la cola que representa de la naturaleza c\u00edclica del tiempo y el eterno retorno. Esto es, el tiempo y la continuidad de la vida.");
        }
    }

    public static void main(String[] args) {

        int exit = 0;
        Scanner in = new Scanner(System.in);

        System.out.println(" \n \t \t \t \t BIENVENIDO AL SISTEMA Junity REALIZADO CON JAVA \n");
        System.out.println(" \n Por favor, ingrese su nombre: \n");

        String name = in.nextLine();

        System.out.println("\n Marque el numero correspondiente si es: \n 1. Hombre, \n 2. Mujer \n 3. Otro.\n ");

        String sexo = in.nextLine();
        switch (sexo) {

            case "1":
                System.out.println("");
                System.out.println("Bienvenido al Sistema " + name + ".");
                break;
            case "2":
                System.out.println("");
                System.out.println("Bienvenida al Sistema " + name + ".");
                break;
            case "3":
                System.out.println("");
                System.out.println("BienvenidE al Sistema " + name + ".");
                break;
            default:
                System.out.println("");
                System.out.println("No entiendo el dato ingresado..." + name + ". \n");
                break;
        }

        System.out.println("Elige una de las opciones del menu:");
        System.out.println("");

        System.out.println("1. Signo Zodiacal Segun tu cumplea\u00f1os.");
        System.out.println("2. Tu edad si fueras perro.");
        System.out.println("3. Dias Vividos.");
        System.out.println("4. Numerologia.");
        System.out.println("");

        int iopcion = 0;

        try {
            int opcion = in.nextInt();
            iopcion = opcion;

            while (opcion <= 0 || opcion > 4) {

                System.out.println("Ups, al parecer te has equivocado. Por favor, ingresa nuevamente la opcion:");
                int newopcion = in.nextInt();
                opcion = newopcion;
                iopcion = opcion;
            }

        } catch (Exception e) {

            System.out.println("Al parecer has ingresado un caracter. Reinicia el sistema y vuelve a intentarlo.");
        }

        switch (iopcion) {

            case (1): {

                System.out.println("\n Haz elegido Signo Zodiacal");
                System.out.println("Por favor ingresa el mes de tu nacimiento: \n");

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

                try {

                    int mes = in.nextInt();
                    imes = mes;

                    while (mes <= 0 || mes > 12) {

                        System.out
                                .println("Ups, al parecer te has equivocado. Por favor, ingresa nuevamente la opcion:");
                        int newmes = in.nextInt();
                        mes = newmes;
                        imes = mes;
                    }

                } catch (Exception e) {

                    System.out.println(
                            "Al parecer has ingresado un caracter. Reinicia el sistema y vuelve a intentarlo.");

                }

                switch (imes) {
                    case (1): {

                        System.out.println("En que Dia de Enero?");
                        System.out.println("");

                        try {

                            int dia = in.nextInt();

                            if (dia > 0 && dia < 21) {

                                System.out.println("\n Tu signo es CAPRICORNIO:");
                                System.out.println(
                                        "\n CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zod\u00edaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancol\u00eda.");
                                System.out.println("\n Gracias por usar nuestro sistema. Feliz Dia.");

                            } else if (dia > 21 && dia < 32) {

                                System.out.println("\n Tu signo es ACUARIO:");
                                System.out.println(
                                        "\n ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual.");
                                System.out.println("\n Gracias por usar nuestro sistema. Feliz Dia.");
                            } else {
                                System.out.println("\n Has digitado un valor invalido.");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.println("\n Has digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (2): {

                        System.out.println("En que Dia de Febrero?");
                        System.out.println("");
                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 20) {

                                System.out.println(" \n Tu signo es ACUARIO:");

                                System.out.println(
                                        " \n ACUARIO es un signo fijo y de aire, y sin duda, es el signo con mayor capacidad para la invención de toda la rueda zodiacal. Simpático, original y brillante, Acuario también es un signo muy humanitario, al mismo tiempo que independiente e intelectual.");

                            } else if (dia > 21 && dia < 29) {

                                System.out.println(" \n Tu signo es PISCIS:");

                                System.out.println(
                                        " \n PISCIS es un signo mutable y de agua, también es el último signo del zodiaco,       precisamente por eso, es el más rico y complejo de todos. Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (3): {

                        System.out.println("En que Dia de Marzo?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 21) {

                                System.out.println(" \n Tu signo es PISCIS:");

                                System.out.println(
                                        " \n PISCIS es un signo mutable y de agua, también es el último signo del zodiaco,       precisamente por eso, es el más rico y complejo de todos. Sensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.");

                            } else if (dia > 21 && dia < 32) {

                                System.out.println(" \n Tu signo es ARIES:");

                                System.out.println(
                                        " \n ARIES forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; también es el primer signo del zod\u00edaco, precisamente por eso, simboliza el inicio, la creación. Se caracteriza por ser una persona rebosante de energ\u00eda y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (4): {

                        System.out.println("En que Dia de Abril?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 21) {

                                System.out.println(" \n Tu signo es ARIES:");

                                System.out.println(
                                        " \n ARIES forma parte de los signos cardinales y al mismo tiempo es un signo de fuego; también es el primer signo del zod\u00edaco, precisamente por eso, simboliza el inicio, la creación. Se caracteriza por ser una persona rebosante de energía y entusiasmo; avanzada y aventurera, adora la libertad, los retos y las nuevas ideas.");

                            } else if (dia > 20 && dia < 31) {

                                System.out.println(" \n Tu signo es TAURO:");

                                System.out.println(
                                        " \n TAURO pertenece a los signos fijos y simultáneamente es un signo de tierra. La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (5): {

                        System.out.println("En que Dia de Mayo?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 22) {

                                System.out.println(" \n Tu signo es TAURO:");

                                System.out.println(
                                        " \n TAURO pertenece a los signos fijos y simultáneamente es un signo de tierra. La proyección del Sol en su nacimiento suele influir para que sean personas firmes, decididas y constantes en varios sentidos. También adoran sentir seguridad, por eso la buscan tanto, es como una necesidad constante en sus vidas.");

                            } else if (dia > 21 && dia < 32) {

                                System.out.println(" \n Tu signo es GEMINIS:");

                                System.out.println(
                                        " \n GEMINIS es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (6): {

                        System.out.println("En que Dia de Junio?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 22) {

                                System.out.println(" \n Tu signo es GEMINIS:");

                                System.out.println(
                                        " \n GEMINIS es un signo mutable que forma parte del elemento aire; como signo de los gemelos, su carácter es doble y bastante contradictorio por complejo. Por una parte es capaz de adaptarse con facilidad y rapidez a todo, pero por otra puede resultar hipócrita. Su distintivo común es la comunicación y el ingenio.");

                            } else if (dia > 21 && dia < 31) {

                                System.out.println(" \n Tu signo es CANCER:");

                                System.out.println(
                                        " \n CANCER Los nacidos bajo el signo de cáncer son personas completamente emocionales, muy sentimentales, imaginativos, cariñosos, protectores y muy sensuales. A la vez, pueden ser t\u00edmidos y muy sensibles, pero excelentes amantes. Es un signo muy divertido, amigable y confiado.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (7): {

                        System.out.println("En que Dia de Julio?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 23) {

                                System.out.println(" \n Tu signo es CANCER:");

                                System.out.println(
                                        " \n CANCER Los nacidos bajo el signo de cáncer son personas completamente emocionales, muy sentimentales, imaginativos, cariñosos, protectores y muy sensuales. A la vez, pueden ser t\u00edmidos y muy sensibles, pero excelentes amantes. Es un signo muy divertido, amigable y confiado.");

                            } else if (dia > 22 && dia < 32) {

                                System.out.println(" \n Tu signo es LEO:");

                                System.out.println(
                                        " \n LEO El signo de Leo es fijo y de fuego, también el signo más dominante del zod\u00edaco. Creativo y abierto, tiene ambición, valor, fuerza, autonom\u00eda y total seguridad en s\u00ed mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (8): {

                        System.out.println("En que Dia de Agosto?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 24) {

                                System.out.println(" \n Tu signo es LEO:");

                                System.out.println(
                                        " \n LEO El signo de Leo es fijo y de fuego, también el signo más dominante del zod\u00edaco. Creativo y abierto, tiene ambición, valor, fuerza, autonom\u00eda y total seguridad en s\u00ed mismo: sabe dónde quiere llegar y nada ni nadie podrá evitarlo.");

                            } else if (dia > 22 && dia < 32) {

                                System.out.println(" \n Tu signo es VIRGO:");

                                System.out.println(
                                        " \n VIRGO es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su esp\u00edritu cr\u00edtico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (9): {

                        System.out.println("En que Dia de Septiembre?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 24) {

                                System.out.println(" \n Tu signo es VIRGO:");

                                System.out.println(
                                        " \n VIRGO es un signo mutable y de tierra; representado por una virgen, es un signo caracterizado por su esp\u00edritu cr\u00edtico, precisión, reserva, paciencia y convencionalismo. También es lógico, metódico y aplicado, le gusta aprender y es capaz de analizar las situaciones más complejas con una claridad pasmosa.");

                            } else if (dia > 23 && dia < 31) {

                                System.out.println(" \n Tu signo es LIBRA:");

                                System.out.println(
                                        " \n LIBRA es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zodíaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (10): {

                        System.out.println("En que Dia de Octubre?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 24) {

                                System.out.println(" \n Tu signo es LIBRA:");

                                System.out.println(
                                        " \n LIBRA es un signo cardinal y de aire, se encuentra además entre los signos más refinados del zod\u00edaco; tiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos. Sus puntos negativos a veces son la frivolidad y un carácter voluble.");

                            } else if (dia > 23 && dia < 32) {

                                System.out.println(" \n Tu signo es ESCORPIO:");

                                System.out.println(
                                        " \n ESCORPIO es un signo fijo y de agua; su potencia y energ\u00eda emocional son únicas en todo el zod\u00edaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (11): {

                        System.out.println("En que Dia de Noviembre?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 23) {

                                System.out.println(" \n Tu signo es ESCORPIO:");

                                System.out.println(
                                        " \n ESCORPIO es un signo fijo y de agua; su potencia y energ\u00eda emocional son únicas en todo el zod\u00edaco. Tiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno.");

                            } else if (dia > 22 && dia < 31) {

                                System.out.println(" \n Tu signo es SAGITARIO:");

                                System.out.println(
                                        " \n SAGITARIO es un signo zodiacal muy honesto, fiel en el amor pero también muy temperamental. Un Sagitario es para siempre hasta que se le traiciona. Optimistas, positivos, modestos, sinceros y simpáticos, los Sagitario (22 noviembre al 21 diciembre) suelen ser la alegr\u00eda de la huerta del zodiaco.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;
                    case (12): {

                        System.out.println("En que Dia de Diciembre?");

                        try {

                            int dia = in.nextInt();
                            if (dia > 0 && dia < 23) {

                                System.out.println(" \n Tu signo es SAGITARIO:");

                                System.out.println(
                                        " \n SAGITARIO es un signo zodiacal muy honesto, fiel en el amor pero también muy temperamental. Un Sagitario es para siempre hasta que se le traiciona. Optimistas, positivos, modestos, sinceros y simpáticos, los Sagitario (22 noviembre al 21 diciembre) suelen ser la alegr\u00eda de la huerta del zodiaco.");

                            } else if (dia > 22 && dia < 32) {

                                System.out.println(" \n Tu signo es CAPRICORNIO:");

                                System.out.println(
                                        " \n CAPRICORNIO es un signo cardinal y de tierra, y uno de los signos del zod\u00edaco más constante, sólido y apacible. También se caracteriza por ser prudente y práctico en todos los asuntos que le conciernen. Sus aspectos más negativos tienden hacia el pesimismo, la fijeza y la melancol\u00eda.");

                            } else {
                                System.out.println("\n Has digitado un valor invalido");
                                System.out.println("El sistema se reiniciara automaticamente ");
                                System.exit(exit);
                            }
                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    }
                        break;

                }
                System.out.println(" \n Gracias por usar nuestro sistema. Feliz Dia.");

            }
                break;

            /* ----------------------- EDAD PERRO ------------------------------ */

            case (2): {

                System.out.println(" \n Haz ingresado: Tu edad si fueras Perro.");

                System.out.println(" \n Por favor digite su edad. (en a\u00f1os)");
                System.out.println("");

                int iedad = 0;
                int edadPerro = 0;

                try {

                    int edad = in.nextInt();
                    iedad = edad;
                } catch (Exception e) {

                    System.out.println("");
                    System.out.println("Has digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara automaticamente");
                    System.exit(exit);
                }

                edadPerro = iedad * 7;

                System.out.println("");
                System.out.println("Gracias por sus datos " + name + ". \n");
                System.out.println(name + ", tu edad si fueras un perro serian: ");
                System.out.println(" \n \t \t \t \t \t  ¯`·.¸¸.·´¯`·.¸¸. " + edadPerro + " a\u00f1os .¸¸.·`¯´·.¸¸.·`¯");

            }
                break;

            /* ----------------------- DIAS VIVIDOS ------------------------------ */

            case (3): {

                int anioActual = LocalDate.now().getYear();
                int mesActual = LocalDate.now().getMonthValue();
                int diaActual = LocalDate.now().getDayOfMonth();

                int diasMesActual = 0;

                int iAnioNacimiento = 0;
                int iMesNacimiento = 0;
                int iDiaNacimiento = 0;
                int diasMesNacimieto = 0;

                switch (mesActual) {

                    case 1:
                        diasMesActual = 0;
                        break;
                    case 2:
                        diasMesActual = 31;
                        break;
                    case 3:
                        diasMesActual = 31 + 28;
                        break;
                    case 4:
                        diasMesActual = 31 + 28 + 31;
                        break;
                    case 6:
                        diasMesActual = 31 + 28 + 31 + 30;
                        break;
                    case 7:
                        diasMesActual = 31 + 28 + 31 + 30 + 31;
                        break;
                    case 8:
                        diasMesActual = 31 + 28 + 31 + 30 + 31 + 30;
                        break;
                    case 9:
                        diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                        break;
                    case 10:
                        diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30;
                        break;
                    case 11:
                        diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31;
                        break;
                    case 12:
                        diasMesActual = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;
                        break;
                }

                int diasHastaFechaActual = ((anioActual * 365) - 365) + diasMesActual + diaActual;

                System.out.println("");
                System.out.println("Haz ingresado: Dias vividos.");
                System.out.println("");
                System.out.println(name + " Por favor ingrese el dia de su nacimiento");
                System.out.println("");

                try {

                    int diaNacimiento = in.nextInt();
                    iDiaNacimiento = diaNacimiento;
                } catch (Exception e) {

                    System.out.println("");
                    System.out.println("Has digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara automaticamente");
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

                try {

                    int mes = in.nextInt();
                    iMesNacimiento = mes;

                } catch (Exception e) {

                    System.out.println("");
                    System.out.println("Has digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara automaticamente");
                    System.exit(exit);
                }

                System.out.println("");
                System.out.println(name + " Por favor ingresa el a\u00f1o de tu nacimiento:");
                System.out.println("");

                try {

                    int anioNacimiento = in.nextInt();
                    iAnioNacimiento = anioNacimiento;
                } catch (Exception e) {

                    System.out.println("");
                    System.out.println("Has digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara automaticamente");
                    System.exit(exit);
                }

                switch (iMesNacimiento) {

                    case 1:
                        diasMesNacimieto = 0;
                        break;
                    case 2:
                        diasMesNacimieto = 31;
                        break;
                    case 3:
                        diasMesNacimieto = 31 + 28;
                        break;
                    case 4:
                        diasMesNacimieto = 31 + 28 + 31;
                        break;
                    case 6:
                        diasMesNacimieto = 31 + 28 + 31 + 30;
                        break;
                    case 7:
                        diasMesNacimieto = 31 + 28 + 31 + 30 + 31;
                        break;
                    case 8:
                        diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30;
                        break;
                    case 9:
                        diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                        break;
                    case 10:
                        diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30;
                        break;
                    case 11:
                        diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31;
                        break;
                    case 12:
                        diasMesNacimieto = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;
                        break;
                }

                int diasHastaFechaNacimieto = ((iAnioNacimiento * 365) - 365) + diasMesNacimieto + iDiaNacimiento;

                int diasVividosTotales = diasHastaFechaActual - diasHastaFechaNacimieto;

                System.out.println("\n Muchas Gracias por tus Datos " + name + ".  \n");
                System.out.println("Hasta la fecha han pasado: " + diasHastaFechaActual + " dias desde el dia 0, hace "
                        + anioActual + " a\u00f1os.");
                System.out.println("Antes de que nacieras, habian pasado " + diasHastaFechaNacimieto + " dias. \n");
                System.out.println(
                        "Por consiguiente, despues de esta pletora de informacion, la cantidad de dias que haz vivido desde tu nacimiento son: \t "
                                + diasVividosTotales + " dias.");

            }
                break;
            case (4): {

                int ianioNacimientoNumerologia = 0;
                int iMesNacimientoNumerologia = 0;
                int idiaNacimietoNumerologia = 0;

                int[] arrayDigitosDias = new int[2];
                int[] arrayDigitosMes = new int[2];
                int[] arrayDigitosAnio = new int[4];
                int[] arrayNumParcial = new int[2];

                System.out.println("\nHaz ingresado: Numerologia.");

                do {

                    System.out.println("\n" + name + " Por favor ingrese el dia de su nacimiento \n");
                    try {
                        int diaNacimietoNumerologia = in.nextInt();
                        idiaNacimietoNumerologia = diaNacimietoNumerologia;
                    } catch (Exception e) {

                        System.out.println("\nHas digitado un valor invalido.");
                        System.out.println("El sistema se reiniciara automaticamente");
                        System.exit(exit);
                    }

                } while (!(idiaNacimietoNumerologia > 0 && idiaNacimietoNumerologia < 32));

                if (idiaNacimietoNumerologia > 0 && idiaNacimietoNumerologia < 32) {

                    do {
                        System.out.println("\n Ingresa tu mes de nacimiento \n");

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
                        System.out.println("12. Diciembre \n");

                        try {

                            int mes = in.nextInt();
                            iMesNacimientoNumerologia = mes;

                        } catch (Exception e) {

                            System.out.print("\n Has Digitado un valor invalido");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    } while (!(iMesNacimientoNumerologia > 0 && iMesNacimientoNumerologia < 13));

                    do {
                        System.out.println("");
                        System.out.println(name + " Por favor ingresa el a\u00f1o de tu nacimiento:");
                        System.out.println("");

                        try {

                            int anioNacimiento = in.nextInt();
                            ianioNacimientoNumerologia = anioNacimiento;
                        } catch (Exception e) {

                            System.out.println("\nHas digitado un valor invalido.");
                            System.out.println("El sistema se reiniciara automaticamente");
                            System.exit(exit);
                        }
                    } while (!(ianioNacimientoNumerologia > 0
                            && ianioNacimientoNumerologia < LocalDate.now().getYear()));

                    int estadoDiasNacimiento = idiaNacimietoNumerologia;
                    int indexDia = 0;

                    while ((int) estadoDiasNacimiento != 0) {

                        arrayDigitosDias[indexDia] = (int) estadoDiasNacimiento % 10;
                        estadoDiasNacimiento = (int) estadoDiasNacimiento / 10;
                        indexDia++;
                    }

                    int estadoMesNacimiento = iMesNacimientoNumerologia;
                    int indexMes = 0;

                    while ((int) estadoMesNacimiento != 0) {

                        arrayDigitosMes[indexMes] = (int) estadoMesNacimiento % 10;
                        estadoMesNacimiento = (int) estadoMesNacimiento / 10;
                        indexMes++;
                    }

                    int estadoAnioNacmimiento = ianioNacimientoNumerologia;
                    int indexAnio = 0;

                    while ((int) estadoAnioNacmimiento != 0) {

                        arrayDigitosAnio[indexAnio] = (int) estadoAnioNacmimiento % 10;
                        estadoAnioNacmimiento = (int) estadoAnioNacmimiento / 10;
                        indexAnio++;
                    }
                }

                else {

                    System.out.println("\nHas digitado un valor invalido.");
                    System.out.println("El sistema se reiniciara automaticamente");
                    System.exit(exit);
                }

                int numVidaParcial = arrayDigitosAnio[0] + arrayDigitosAnio[1] + arrayDigitosAnio[2]
                        + arrayDigitosAnio[3] + arrayDigitosDias[0] + arrayDigitosDias[1] + arrayDigitosMes[0]
                        + arrayDigitosMes[1];

                if (!(numVidaParcial > 0 && numVidaParcial < 10)) {

                    int estadoNumParcial = numVidaParcial;
                    int indexNumParcial = 0;

                    System.out.println(estadoNumParcial);

                    while ((int) estadoNumParcial != 0) {

                        arrayNumParcial[indexNumParcial] = (int) estadoNumParcial % 10;
                        estadoNumParcial = (int) estadoNumParcial / 10;
                        indexNumParcial++;
                    }

                    int numVida = arrayNumParcial[0] + arrayNumParcial[1];

                    System.out.println("\n " + name + ", muchas Gracias por tus Datos.");

                    System.out.println(
                            "\n De acuerdo con lo proporcionado, tu numero de vida, segun la numerologia es: \t"
                                    + numVida);

                    Numerologia(numVida);

                } else {

                    System.out.println("\n " + name + ", muchas Gracias por tus Datos.");

                    System.out.println(
                            "\n De acuerdo con lo proporcionado, tu numero de vida, segun la numerologia es: \t"
                                    + numVidaParcial);

                    Numerologia(numVidaParcial);

                }

            }
        }
    }
}
