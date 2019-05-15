package sorteiojava;

import java.util.Random;
import java.util.Scanner;

public class SorteioJavaAvancado {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        //Descobre o tamanho do array
        System.out.println("Quantas pessoas irão participar ?");
        int numeroPessoas = leia.nextInt();

        String[] nomes = new String[numeroPessoas];
        //--------------

        //Preenche o array
        boolean repetido = false;
        String aux;
        for (int i = 0; i < nomes.length; i++) {
            
            do {
                 System.out.println
                 ("Informe o nome do participante "+(i+1)+":");
                 aux = leia.next();
                 
                 for (int i2 = 0; i2 < nomes.length; i2++) {
                     if (nomes[i2] != null) {
                         if (nomes[i2].equals(aux)) {
                             repetido = true;
                             
                             break;
                         }
                     }
                     repetido = false;
                 }
                 
            }while(repetido);
            
            nomes[i] = aux;

        }

        /*Sorteia um nome com 
        base no indíce do array*/
        Random r = new Random();
        int idx = r.nextInt(nomes.length);
        System.out.println("Ganhador(a):");
        System.out.println(nomes[idx]);

    }

}
