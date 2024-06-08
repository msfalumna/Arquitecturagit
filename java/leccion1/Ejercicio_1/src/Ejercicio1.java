//Tienda de libros;
//package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    private static String nombreLibro;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro:");
        System.out.println("Digite el id del libro:");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro:");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envio es gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());

        System.out.println(nombreLibro + "#" + idLibro);
        System.out.println("precio del libro:$" + idLibro);
        System.out.println("El envio del libro gratuito es: " + envioGratuito);
        //operador unarios: cambio de signo
        var varA = 70;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        //operador de negacion
        var varC = true;// esta literal por default en java es de tipo boolean
        var varD = !varC; // aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //operador unario de incremento: Preincremento
        var varE = 9; //se va a modificar su valor
        var varF = ++varE; //simbolo antes de la variable
        //Primero se incremento la variable y despues se uso su valor
        System.out.println("varE = " + varE);//se incrementa en la unidad
        System.out.println("varF = " + varF);//va a sumar uno

        //Post incremento(El simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable,luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        //Operadores Unarios de decremento: Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//la variable ya esta con decremento
        System.out.println("varJ = " + varJ);

        //Post decremento
        var varK = 8;
        var varL = varK--; //primero el valor de la variable luego queda el decremento
        System.out.println("varK = " + varK);//aqui va a decrementar en 1
        System.out.println("varL = " + varL);

        //operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = aNum == bNum;
        System.out.println("cNum = " + cNum);

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);//resultado 6
        System.out.println("y = " + y);//tener 9 porque resta 1
        System.out.println("z = " + z);//tener resultado 16

        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        //operador relacional nos va a indicar si un valor es = o menor a otro
        var gVar = aNum >= bNum;
        System.out.println("gVar = " + gVar);

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
            System.out.println("Es menor de edad");

            //operador and
            var valorA = 7;
            var ValorMinimo = 0;// rango del 0 al 10
            var ValorMaximo = 10;
            var respuesta = valorA >= 0 && valorA <= 10;
            if (respuesta) {
                System.out.println("Esta dentro del rango estabelcido");
            } else {
                System.out.println("Esta fuera del rango establecido");
            }

            var vacaciones = false;
            var diaLibre = false;
            if (vacaciones || diaLibre);
            System.out.println("Papa puede asistir al juego de su hijo");
       
             System.out.println("Papa no puede asistir al juego de su hijo");
             
             
    }

    {

    }
}

}
