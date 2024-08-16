package contaryencontrar;

/**
 *
 * @author Felipe Alzate
 */
public class ContarYEncontrar {

    public static void main(String[] args) {       
        char[] caracteres={'a','b','c','a','d','e','a','f','b','c','a','d','d','e'};
     
        int[] frecuencias = new int[26];
        System.out.println(caracteres);

       
        for (char c : caracteres) {
            int indice = c - 'a'; 
            frecuencias[indice]++;
        }

        // Encontrar el carácter más frecuente
        char leFrecuente = ' ';
        int numFrecuencia = 0;
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > numFrecuencia) {
                numFrecuencia = frecuencias[i];
                leFrecuente = (char) (i + 'a'); 
            }
        }
       
        System.out.println();
        System.out.println("EL CARÁCTER MÁS FRECUENTE ES: " + leFrecuente + "' CON UNA FRECUENCIA DE: " + numFrecuencia);
    }
}
