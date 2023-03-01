package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int numero = 0;
String c = "";
System.out.print("Introduzca el valor de una calificación: ");
numero = reader.nextInt();

if (numero >= 0 && numero < 5)
c = "Suspenso";
else if (numero >= 5 && numero < 7)
c = "Aprobado";
else if (numero >= 7 && numero <9)
c = "Notable";
else if (numero >= 9 && numero <= 10)
c = "Sobresaliente";
else
c = "El valor de la calificación introducida no es correcta";

System.out.println(c);
reader.close();
}
}
