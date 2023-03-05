public class Outils {

    public static int tempsMoyen(int tailleTableau, int nombreIteration){
        long moyenne = 0;
        for (int i = 1; i <= nombreIteration; i++){
            long tempsDeCalcul;
            int[] tableauATier = SAE2.générerDonnées(tailleTableau);

            //Tri comptage
            //int[] tableauAtrier = SAE2.générerDonnéesEntreBornes(tailleTableau, 0, 100000000);
            //int max = FonctionsDiverses.maxTableau(tableauAtrier);
            //int min = FonctionsDiverses.minTableau(tableauAtrier);

            long tempsDébut= System.nanoTime();
            //Trie.triInsertion(tableauATier);
            Tri.triCocktail(tableauATier);
            //Trie.triAPeigne(tableauATier);
            //int[] tabTRieComptage = Trie.triComptage(tableauAtrier,min,max);
            long tempsFin = System.nanoTime();

            tempsDeCalcul = ((tempsFin - tempsDébut) / 1000000);
            System.out.println("Essai " + i + " : " + tempsDeCalcul + " ms");
            moyenne = moyenne + tempsDeCalcul;
        }
        moyenne = moyenne / nombreIteration;
        System.out.println("Moyenne : " + moyenne + " ms");

        return (int) moyenne;
    }
}
