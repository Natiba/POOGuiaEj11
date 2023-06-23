package pooguiaej11;

import java.util.Date;
import java.util.Scanner;

public class POOGuiaEj11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número del 01 al 31 para el día");
        int day = sc.nextInt();

        System.out.println("Ingrese un número de 2 dígitos,  del 01 al 12 para el mes");
        int month = sc.nextInt();
       

//         public int getTheDay() {
//        switch (month) {
//            case 01:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//                day = sc.nextInt();
//                //return day;
//            case 02:
//                System.out.println("Ingrese un número del 01 al 28 para el día");
//                day = sc.nextInt();
//                // faltaria chequear si es bisiesto!!
//                //return day;
//            case 03:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//               day = sc.nextInt();
//                return day;
//            case 4:
//                System.out.println("Ingrese un número del 01 al 30 para el día");
//                day = sc.nextInt();
//                return day;
//            case 5:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//                day = sc.nextInt();
//                return day;
//            case 6:
//                System.out.println("Ingrese un número del 01 al 30 para el día");
//               day = sc.nextInt();
//                return day;
//            case 7:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//                day = sc.nextInt();
//                return day;
//            case 8:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//                day = sc.nextInt();
//                return day;
//            case 9:
//                System.out.println("Ingrese un número del 01 al 30 para el día");
//                day = sc.nextInt();
//                return day;
//            case 10:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//                day = sc.nextInt();
//                return day;
//            case 11:
//                System.out.println("Ingrese un número del 01 al 30 para el día");
//                day = sc.nextInt();
//                return day;
//            case 12:
//                System.out.println("Ingrese un número del 01 al 31 para el día");
//                day = sc.nextInt();
//                return day;
//        }
//         }
        System.out.println("Ingrese un numero para el año");
        int year = sc.nextInt();
        System.out.println("");

        Date fecha = new Date(year - 1900, month - 1, day);
        System.out.println("Fecha " + fecha);
         System.out.println("");

        Date fechaActual = new Date();
        System.out.println("Fecha actual " + fechaActual);
         System.out.println("");
          System.out.println("---------------------------------------------");

        int years = fechaActual.getYear() - fecha.getYear();
        System.out.println("Hay " + years + " años de diferencia entre la fecha que ingresó y hoy");
         System.out.println("");

    }
}

//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
