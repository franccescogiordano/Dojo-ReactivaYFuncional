import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {


        List<Correo> correos = new ArrayList<Correo>();
        List<Correo> correosReseteados = new ArrayList<Correo>();
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


        //a Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
        List<Correo> distinctElements = correos
                .stream()
                .distinct().collect(Collectors.toList());

        //b Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
        List<Correo> correosConDominio = correos.stream()
                .filter(correo -> correo.getCorreo().contains("@gmail") || correo.getCorreo().contains("@hotmail") || correo.getCorreo().contains("@outlook")).collect(Collectors.toList());

        //c Map: para saber si todos los correos cumple con todas las condiciones (Que cuente con el @ y el dominio)

        List<Correo> correosValidados = correos.stream().map(correo -> correo
        ).filter(e -> e.getCorreo().contains(".com") &&
                e.getCorreo().contains("@gmail")
                ||
                e.getCorreo().contains("@hotmail") ||
                e.getCorreo().contains("@outlook")).collect(Collectors.toList());
        if (correosValidados.size() == correos.size()) {
            System.out.println("los correos estaban ok");
        } else {
            System.out.println("Revise los correos");
        }
//D Saber la cantidad de correos que hay, sin usar un ciclo
        System.out.println("la cantidad de correos es :" + correos.size());
// e Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
        System.out.println("la cantidad de correos gmail es " + correos.stream().map(x -> x).filter(correo -> correo.getCorreo().contains("@gmail")).collect(Collectors.toList()).size());
        System.out.println("la cantidad de correos hotmail es " + correos.stream().map(x -> x).filter(correo -> correo.getCorreo().contains("@hotmail")).collect(Collectors.toList()).size());
        System.out.println("la cantidad de correos outlook es " + correos.stream().map(x -> x).filter(correo -> correo.getCorreo().contains("@outlook")).collect(Collectors.toList()).size());

        correosReseteados= correos.stream().filter(correo -> {
            if(correo.getEstado()){
               correo.changeBoolean();
            }
          return true;
        }).collect(Collectors.toList());

        correosReseteados.forEach(System.out::println);


        }

        //ejercicio 2
        

    }


