import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TriTest {

    @Test
    public final void triCocktailTest(){
        int[] tableauNonTrie = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] tableauTrie = {1, 2, 3, 4, 5, 6, 7, 8};
        Tri.triCocktail(tableauNonTrie);

        assertArrayEquals(tableauTrie, tableauNonTrie);
    }

    @Test
    public final void triInsertionTest(){
        int[] tableauNonTrie = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] tableauTrie = {1, 2, 3, 4, 5, 6, 7, 8};
        Tri.triInsertion(tableauNonTrie);

        assertArrayEquals(tableauTrie, tableauNonTrie);
    }

    @Test
    public final void triComptageTest(){
        int[] tableauNonTrie = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] tableauTrie = {1, 2, 3, 4, 5, 6, 7, 8};
        Tri.triInsertion(tableauNonTrie);

        int[] tableauNonTrie2 = {9, 5, 2, -10, 9, 9, 2, 4};
        int[] tableauTrie2 = {-10, 2, 2, 4, 5, 9, 9, 9};
        Tri.triInsertion(tableauNonTrie2);

        assertArrayEquals(tableauTrie, Tri.triComptage(tableauNonTrie,1,8));
        assertArrayEquals(tableauTrie2, Tri.triComptage(tableauNonTrie2,-10,9));
    }

    @Test
    public final void triPeigneTest(){
        int[] tableauNonTrie = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] tableauTrie = {1, 2, 3, 4, 5, 6, 7, 8};
        Tri.triAPeigne(tableauNonTrie);

        int[] tableauNonTrie2 = {9, 5, 2, -10, 9, 9, 2, 4};
        int[] tableauTrie2 = {-10, 2, 2, 4, 5, 9, 9, 9};
        Tri.triAPeigne(tableauNonTrie2);

        assertArrayEquals(tableauTrie, tableauNonTrie);
        assertArrayEquals(tableauTrie2, tableauNonTrie2);
    }
}
