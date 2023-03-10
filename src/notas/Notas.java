package notas;
import java.util.Scanner;

/**
 * La clase Notas es un programa que pide una calificación numérica por teclado
 * y la clasifica utilizando el método público califica de la clase Califica.
 */
public class Notas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduzca el valor de una calificación: ");
        int n = reader.nextInt();
        String c = Califica.califica(n);
        System.out.println(c);
        reader.close();
    }
}

/**
 * La clase Califica es una clase de utilidad que clasifica una calificación
 * numérica en función de su valor y devuelve una cadena que representa su
 * valoración.
 */
class Califica {

    /**
     * El método público califica clasifica una calificación numérica en función de
     * su valor y devuelve una cadena que representa su valoración.
     *
     * @param num_nota la calificación numérica a clasificar
     * @return la valoración correspondiente a la calificación
     */
    public static String califica(int num_nota) {
        if (num_nota < 0 || num_nota > 10) {
            return "El valor de la calificación introducida no es correcto";
        } else if (num_nota < 5) {
            return "Suspenso";
        } else if (num_nota < 7) {
            return "Aprobado";
        } else if (num_nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}

}












