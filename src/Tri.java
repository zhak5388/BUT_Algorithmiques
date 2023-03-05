public class Tri {

    public static void main(String[] args) {
        System.out.println("Tri cocktail");
        Outils.tempsMoyen(10000,10);
    }

    public static void triAPeigne(int[] tab) {
        int ecart = tab.length;
        boolean swapped = true;
        while (ecart > 1 || swapped) {
            if (ecart > 1) {
                ecart = (int) (ecart / 1.3);
            }
            swapped = false;
            for (int i = 0; i + ecart < tab.length; i++) {   //ecart : 9 6 4 3 2 1
                if (tab[i] > tab[i + ecart]) {
                    int pivot = tab[i];
                    tab[i] = tab[i + ecart];
                    tab[i + ecart] = pivot;
                    swapped = true;
                }
            }
        }
    }

    public static void triInsertion(int[] tableauATrier) {
        for (int i = 1; i < tableauATrier.length; i++) {
            int j = i;
            int valeurAInserer = tableauATrier[i]; //Il faut le mémoriser
            while (j > 0 && tableauATrier[j - 1] > valeurAInserer) {
                tableauATrier[j] = tableauATrier[j - 1];
                j--;
            }

            tableauATrier[j] = valeurAInserer;
        }
    }

    public static int[] triComptage(int[] tableauATrier, int min, int max){
        int[] tableauComptage = new int[max - min + 1]; // min 2 et max 5 = > 5-2 + 1 entiers
        int[] tableauTrié = new int[tableauATrier.length];

        for(int i = 0; i < tableauATrier.length; i++){
            /*
            Par exemple pour un tableau ayant pour min 5,
            à l'indice 0 le tableau Comptage stockera le nombre d'occurence de 5 du tableau a trier.
            On a donc valeur de T[i] - min.
             */
            tableauComptage[tableauATrier[i] - min]++;
        }

        int indiceTableauTrie = 0;
        for(int i = 0; i < tableauComptage.length; i++){
            for(int j = 0; j < tableauComptage[i]; j++){
                tableauTrié[indiceTableauTrie] = i + min;
                indiceTableauTrie++;
            }
        }
        
        return tableauTrié;
    }

    public static void triCocktail(int tab[])
    {
        boolean echanges = true;
        int fin = tab.length;
        int debut = 0;

        while (echanges) {
            echanges = false;

            for (int i = debut; i < fin -1; ++i) {
                if (tab[i] > tab[i + 1]) {
                    int pivot = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = pivot;
                    echanges = true;
                }
            }

            if (!echanges)
                break;

            echanges = false;

            fin--;

            for (int i = fin - 1; i >= debut; i--) {
                if (tab[i] > tab[i + 1]) {
                    int pivot = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = pivot;
                    echanges = true;
                }
            }

            debut = debut+1;
        }
    }
}
