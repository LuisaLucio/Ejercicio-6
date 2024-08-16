package contaryencontrar;

/**
 *
 * @author Luisa Lucio
 */
public class ContarYEncontrar {

    public static void main(String[] args) {
       char[] caracteres={'a','b','c','a','d','e','a','f','b','c','a','d','d','e'};
     // Array de frecuencias para contar ocurrencias (tamaño 26 para cada letra del alfabeto inglés)
        int[] frecuencias = new int[26];
        System.out.println(caracteres);

        // Contar las ocurrencias de cada carácter
        for (char c : caracteres) {
            int indice = c - 'a'; // Convertir el carácter a un índice (0 para 'a', 1 para 'b', etc.)
            frecuencias[indice]++;
        }

        // Encontrar el carácter más frecuente
        char leFrecuente = ' ';
        int numFrecuencia = 0;
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > numFrecuencia) {
                numFrecuencia = frecuencias[i];
                leFrecuente = (char) (i + 'a'); // Convertir el índice de vuelta al carácter
            }
        }

        // Mostrar el carácter más frecuente y su conteo
        System.out.println();
        System.out.println("EL CARÁCTER MÁS FRECUENTE ES: " + leFrecuente);
        System.out.println("FRECUENCIA: " + numFrecuencia);
    }
    
}
