import java.util.Arrays;

public class Exercice4 {

    public static void main(String[] args) {
        int tailleTableau = 100000000;
        int quantitePlusGrand = 10000;
        long moyenneAlgo = 0;
        long moyenneNaif = 0;
        int nombreIteration = 3;
        for (int i = 1; i <= nombreIteration; i++){
            int[] tableauTresLong = SAE2.générerDonnées(tailleTableau);
            //Arrays.sort(tableauTresLong);

            long tempsDébutAlgoNaif = System.nanoTime();
            int[] tableauDesPlusGrandsNaif = plusGrandesValeursNaif(tableauTresLong, quantitePlusGrand);
            long tempsFinAlgoNaif = System.nanoTime();

            long tempsDébutAlgoPersonnalise = System.nanoTime();
            int[] tableauDesPlusGrandPersonnalise = plusGrandesValeurs(tableauTresLong,quantitePlusGrand);
            long tempsFinAlgoPersonnalise = System.nanoTime();

            moyenneNaif = ((tempsFinAlgoNaif - tempsDébutAlgoNaif) / 1000000) + moyenneNaif;
            moyenneAlgo = ((tempsFinAlgoPersonnalise - tempsDébutAlgoPersonnalise) / 1000000) + moyenneAlgo;

            System.out.println();
        }
        moyenneNaif = moyenneNaif / nombreIteration;
        moyenneAlgo = moyenneAlgo / nombreIteration;
        System.out.println("Moyenne Naif : " + moyenneNaif + " ms");
        System.out.println("Moyenne Algo : " + moyenneAlgo + " ms");
    }
    public static int[] plusGrandesValeurs(int[] tableau, int quantitePlusGrandNombre){
        int[] tableauDesPlusGrands = new int[quantitePlusGrandNombre];

        for (int i = 0; i < quantitePlusGrandNombre; i++){
            tableauDesPlusGrands[i] = tableau[i];
        }

        Arrays.sort(tableauDesPlusGrands);

        for (int i = quantitePlusGrandNombre; i < tableau.length ; i++){
            if(tableau[i] >= tableauDesPlusGrands[quantitePlusGrandNombre-1]){
                for (int j = 0; j <= (quantitePlusGrandNombre-2) ; j++ ){
                    tableauDesPlusGrands[j] = tableauDesPlusGrands[j+1];
                }
                tableauDesPlusGrands[quantitePlusGrandNombre-1] = tableau[i];
            }
            else if(tableauDesPlusGrands[0] < tableau[i]){
                int indiceInsertion = tableauDesPlusGrands.length-2;
                while (tableau[i]<tableauDesPlusGrands[indiceInsertion]){
                    indiceInsertion--;
                }

                for(int j = 0 ; j <= (indiceInsertion - 1) ; j++){
                    tableauDesPlusGrands[j] = tableauDesPlusGrands[j+1];
                }
                tableauDesPlusGrands[indiceInsertion] = tableau[i];
            }
        }

        int pivot;

        for (int i = 0; i < tableauDesPlusGrands.length/2; i ++){
            pivot = tableauDesPlusGrands[i];
            tableauDesPlusGrands[i] = tableauDesPlusGrands[tableauDesPlusGrands.length-i-1];
            tableauDesPlusGrands[tableauDesPlusGrands.length-i-1] = pivot;
        }

        return tableauDesPlusGrands;
    }

    public static int[] plusGrandesValeursNaif(int[] tableau, int quantitePlusGrandNombre){
        int[] tableauDesPlusGrands = new int[quantitePlusGrandNombre];

        int[] copieTableau = tableau.clone();
        Arrays.sort(copieTableau);

        for (int i = 0; i< quantitePlusGrandNombre;i++){
            tableauDesPlusGrands[quantitePlusGrandNombre - 1 -i] = copieTableau[(copieTableau.length - quantitePlusGrandNombre + i)];
        }

        return tableauDesPlusGrands;
    }
}
