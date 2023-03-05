import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exercice4Test {
    @Test
    public final void plusGrandeValeursTest(){
        int[] tableau6NonTrie =  { 4, 5, 2, 8, 1, 0} ;
        int[] tableau3PlusGrandes = {8, 5, 4};

        int[] tableau110NonTrieValeurRepetee = {1420, -4497, -4041, 2727, 3079, -1592, 1038, -3593, -946, 3422, -2610, 606, 3859, -3595, 4251, 2372, 3672, 3020, 4830, 2216, 196, 3809, 1856, -1851, 4395, -576, -1771, 286, -1470, -41, -4274, 2644, -710, 3671, -3984, -1660, -4330, 731, 1225, -1975, 2777, -2931, -4236, -906, -3267, 1850, -2777, -4997, -3522, -306, 1729, -162, -4616, -4658, -1604, 3149, -624, 4149, -1793, 4082, -1528, -3481, -4992, 1788, -4439, -1777, 165, 1208, -396, 1345, -2136, -519, 416, 2588, -4938, -1610, -1238, -3388, -1375, 2578, -1466, 2155, 2345, 1543, -2508, -2230, -1794, -4132, -782, 2228, -472, 4551, 1777, 1813, -1587, 836, -2144, 3098, -3674, -1454, -2871, -4900, -4550, -484, 4006, 4550, 3859, -4522, 2997, -1505};
        int[] tableau10PlusGrandesValeurRepetee = {4830, 4551, 4550, 4395, 4251, 4149, 4082, 4006, 3859, 3859};

        assertArrayEquals(tableau3PlusGrandes, Exercice4.plusGrandesValeurs(tableau6NonTrie,3));
        assertArrayEquals(tableau10PlusGrandesValeurRepetee, Exercice4.plusGrandesValeurs(tableau110NonTrieValeurRepetee,10));
    }

    @Test
    public final void plusGrandeValeursNaifTest(){
        int[] tableau6NonTrie =  { 4, 5, 2, 8, 1, 0} ;
        int[] tableau3PlusGrandes = {8, 5, 4};

        int[] tableau110NonTrieValeurRepetee = {1420, -4497, -4041, 2727, 3079, -1592, 1038, -3593, -946, 3422, -2610, 606, 3859, -3595, 4251, 2372, 3672, 3020, 4830, 2216, 196, 3809, 1856, -1851, 4395, -576, -1771, 286, -1470, -41, -4274, 2644, -710, 3671, -3984, -1660, -4330, 731, 1225, -1975, 2777, -2931, -4236, -906, -3267, 1850, -2777, -4997, -3522, -306, 1729, -162, -4616, -4658, -1604, 3149, -624, 4149, -1793, 4082, -1528, -3481, -4992, 1788, -4439, -1777, 165, 1208, -396, 1345, -2136, -519, 416, 2588, -4938, -1610, -1238, -3388, -1375, 2578, -1466, 2155, 2345, 1543, -2508, -2230, -1794, -4132, -782, 2228, -472, 4551, 1777, 1813, -1587, 836, -2144, 3098, -3674, -1454, -2871, -4900, -4550, -484, 4006, 4550, 3859, -4522, 2997, -1505};
        int[] tableau10PlusGrandesValeurRepetee = {4830, 4551, 4550, 4395, 4251, 4149, 4082, 4006, 3859, 3859};

        assertArrayEquals(tableau3PlusGrandes, Exercice4.plusGrandesValeursNaif(tableau6NonTrie,3));
        assertArrayEquals(tableau10PlusGrandesValeurRepetee, Exercice4.plusGrandesValeursNaif(tableau110NonTrieValeurRepetee,10));
    }
}
