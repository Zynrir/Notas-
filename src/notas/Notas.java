package notas;
import java.util.Scanner;
/**
 * La clase Notas es un programa que clasifica una calificación numérica
 * ingresada por el usuario y la convierte en una cadena que representa su
 * valoración, utilizando el método público cali.
 */
public class Notas {
    /**
     * El método público cali clasifica una calificación numérica en función de
     * su valor y devuelve una cadena que representa su valoración.
     * @param n la calificación numérica a clasificar
     * @return la valoración correspondiente a la calificación
     */
public static String cali(int n) {
  if (n < 0 || n > 10) {
    return "El valor de la calificación introducida no es correcto";
} else if (n < 5) {
    return "Suspenso";
} else if (n < 7) {
    return "Aprobado";
} else if (n < 9) {
    return "Notable";
} else {
    return "Sobresaliente";
   	}
}
public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
   System.out.print("Introduzca el valor de una calificación: ");
   	int n = reader.nextInt();
    String c = cali(n);
   System.out.println(c);
    reader.close();
    }
}
