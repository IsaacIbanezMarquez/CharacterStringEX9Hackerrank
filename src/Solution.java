


import java.io.*;
import java.util.*;



// Es palíndrom?:

/*  Un palíndrom és una frase que es llegeix igual d'esquerra a dreta que de dreta a esquerra. Per a més informació: Palíndrom

Suprimim els signes de puntuació i els espais i ens fixem només en les lletres de l'abecedari.

Donat una cadena de text determina si és palíndrom o no. Si ho és imprimeix TRUE, en cas contrari FALSE.

Input Format

Introdueix una cadena de text acabada en un final de línia.

Constraints

No n'hi ha.

Output Format

{TRUE | FALSE}

Sample Input 0

Aquesta frase no es un palindrom
Sample Output 0

FALSE
Sample Input 1

Apa! Cal a la capa?
Sample Output 1

TRUE
Sample Input 2

Sorra a la "boda" i adoba l'arros.
Sample Output 2

FALSE
 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String original, reverso = "";
        original = sc.nextLine();
        original = original.replaceAll("[^a-zA-Z]","").toLowerCase();
        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverso = reverso + original.charAt(i);

        if (original.equals(reverso))
        {
            System.out.println("TRUE");
        }

        else
        {
            System.out.println("FALSE");
        }

    }
}
