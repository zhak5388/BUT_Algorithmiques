import java.util.Arrays;

public class FonctionsDiverses {

    public static int maxTableau(int[] tableau){
        int max = tableau[0];
        for(int i = 1; i < tableau.length ; i++){
            if(max < tableau[i]) max = tableau[i];
        }
        return max;
    }

    public static int minTableau(int[] tableau){
        int min = tableau[0];
        for(int i = 1; i < tableau.length ; i++){
            if(min > tableau[i]) min = tableau[i];
        }
        return min;
    }
    public static int[] copieTableau(int[] tableauACopier){
        int[] tableauCopie = new int[tableauACopier.length];

        for (int i = 0; i < tableauACopier.length; i ++){
            tableauCopie[i] = tableauACopier[i];
        }
        return tableauCopie;
    }

    public static void visualiserTableau(int[] tableau){
        for (int i = 0; i < tableau.length; i++){
            System.out.println(tableau[i]);
        }
    }

    public static void visualiserTableauEnUneSeuleLigne(int[] tableau){
        for (int i = 0; i < (tableau.length - 1); i++){
            System.out.print(tableau[i] + ", ");
        }
        System.out.println(tableau[(tableau.length - 1)]);
    }

    public static boolean egaliteTableau(int[] tableau1, int[] tableau2){
        for(int i = 0; i < tableau1.length; i++){
            if(tableau1[i] != tableau2[i]) return false;
        }
        return true;
    }

    public static int[] trieInverse(int[] tableau){
        int[] tableauInverseTrie = new int[tableau.length];
        Arrays.sort(tableau);
        for(int i = 0; i < tableau.length; i++){
            tableauInverseTrie[i] = tableau[tableau.length - 1 - i];
        }
        return tableauInverseTrie;
    }
}
