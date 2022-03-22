import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static List<Correo> correos = new ArrayList<Correo>();
    public static List<Correo> correosReseteados = new ArrayList<Correo>();

    public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
        cargarCorreos();
        int opcion=0;
        do {
            System.out.println("Ingrese el numero de ejercicio a realizar 1 2 o 3");
            opcion=sc1.nextInt();
            switch (opcion){

                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3(); //solo se hizo la parte de derivar
                    break;
                default:
                    break;
            }

        }while (opcion!=0);


    }

    //ejercicio 2
    public static void cargarCorreos() {

        correos.add(new Correo("franco.sosa@gmail.com", false));
        correos.add(new Correo("franco.sosa1@gmail.com", true));
        correos.add(new Correo("franco.sosa2@gmail.com", true));
        correos.add(new Correo("franco.sosa3@gmail.com", false));
        correos.add(new Correo("franco.sosa4@gmail.com", true));
        correos.add(new Correo("franco.sosa5.com", false));
        correos.add(new Correo("franco.sosa6@gmail.com", true));
        correos.add(new Correo("franco.sosa8@gmail.com", true));
        correos.add(new Correo("franco.sosa8@gmail.com", true));
        correos.add(new Correo("franco.sosa9@outlook.com", true));
        correos.add(new Correo("franco.sosa10@hotmail.com", true));
        correos.add(new Correo("franco.sosa11@gmail.com", true));
        correos.add(new Correo("franco.sosa12@gmail.com", true));
        correos.add(new Correo("franco.sosa13@gmail.com", true));
        correos.add(new Correo("franco.sosa14@gmail.com", true));
        correos.add(new Correo("franco.sosa15@gmail.com", true));
        correos.add(new Correo("franco.sosa16@gmail.com", true));
        correos.add(new Correo("franco.sosa17@gmail.com", true));
        correos.add(new Correo("franco.sosa18@gmail.com", true));
        correos.add(new Correo("franco.sosa19@gmail.com", true));
        correos.add(new Correo("franco.sosa20@gmail.com", false));
        correos.add(new Correo("franco.sosa21@gmail.com", false));
        correos.add(new Correo("franco.sosa22@gmail.com", true));
        correos.add(new Correo("franco.sosa23@gmail.com", false));
        correos.add(new Correo("franco.sosa24@gmail.com", true));
        correos.add(new Correo("franco.sosa25@gmail.com", false));
        correos.add(new Correo("franco.sosa26@gmail.com", true));
        correos.add(new Correo("franco.sosa27.com", false));
        correos.add(new Correo("franco.sosa28@gmail.com", true));
        correos.add(new Correo("franco.sosa29@gmail.com", false));
    }

    public static void ejercicio1() {
        //a Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
        List<Correo> distinctElements = correos
                .stream()
                .distinct().collect(Collectors.toList());

        //b Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
        List<Correo> correosConDominio = correos.stream()
                .filter(correo -> correo.getCorreo().contains("@gmail") || correo.getCorreo().contains("@hotmail") || correo.getCorreo().contains("@outlook")).collect(Collectors.toList());

        //c Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)

        List<Correo> correosValidados = correos.stream().map(correo -> correo
        ).filter(e ->
                e.getCorreo().contains("@gmail.com")
                        ||
                        e.getCorreo().contains("@hotmail.com") ||
                        e.getCorreo().contains("@outlook.com")).collect(Collectors.toList());
        if (correosValidados.size() == correos.size()) {
            System.out.println("los correos estaban ok");
        } else {
            System.out.println("Revise los correos");
        }
//D Saber la cantidad de correos que hay, sin usar un ciclo
        System.out.println("la cantidad de correos es :" + correos.size());
// e Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
        System.out.println("la cantidad de correos gmail es " + correos.stream().map(x -> x).filter(correo -> correo.getCorreo().contains("@gmail.com")).collect(Collectors.toList()).size());
        System.out.println("la cantidad de correos hotmail es " + correos.stream().map(x -> x).filter(correo -> correo.getCorreo().contains("@hotmail.com")).collect(Collectors.toList()).size());
        System.out.println("la cantidad de correos outlook es " + correos.stream().map(x -> x).filter(correo -> correo.getCorreo().contains("@outlook.com")).collect(Collectors.toList()).size());

        correosReseteados = correos.stream().filter(correo -> {
            if (correo.getEstado()) {
                correo.changeBoolean();
            }
            return true;
        }).collect(Collectors.toList());

        correosReseteados.forEach(System.out::println);
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        List<String> chat = new ArrayList<>();
        final List<String> malasPalabras = List.of("malo1",
                "malo2",
                "malo3",
                "malo4",
                "malo5",
                "malo",
                "malo6",
                "malo7",
                "malo8",
                "malo9",
                "malo10");
     /*   final List<String> test = List.of("malo1",
                "malo2",
                "malo3",
                "malo4",
                "malo5",
                "malo",
                "malo6 dasdasdas",
                "malo7 dsadasd",
                "malo8 dsadasda",
                "malo9 dasdasda",
                "dasdasda");
                */
        int i = 0;
        do {
            System.out.println("ingrese una frase");
            entrada = sc.nextLine();
            chat.add(entrada);
            i++;
        } while (i < 9);

        chat.stream().map(palabra -> {
            String word = malasPalabras.stream().
                    filter(palabra::contains).
                    findFirst().
                    orElse("");
            if (!word.isEmpty()) {
                return palabra.replace(word, "***");
            }

            return palabra;
        }).forEach(System.out::println);


        //

    }

    public static void ejercicio3() {
        int gradoPolinomio;
        double coeficientes[]=new double[4];
        Derivacion derivada = null;
        Scanner sc=new Scanner(System.in);
        int numdev=1;
        System.out.println("ingrese la derivada a realizar 1 o 2");
        numdev=sc.nextInt();
        gradoPolinomio=sc.nextInt();
        System.out.println("ingrese el grado del polinomio maximo grado 3");
        gradoPolinomio=sc.nextInt();
        int i=gradoPolinomio;
        do {

            System.out.println("ingrese el coeficiente para x^"+i);
            coeficientes[i]=sc.nextDouble();
            i--;
        }while (i>-1);
        derivada = new Derivacion(gradoPolinomio,coeficientes);
        System.out.println( derivada.mostrarpolinomio());
          derivada.Derivar(numdev);
        System.out.println( derivada.mostrarpolinomio());

    }

}


