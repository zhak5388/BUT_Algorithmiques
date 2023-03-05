import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FonctionsDiversesTest {
    @Test
    public final void maxTableauTest(){
        int[] tableau1 = {1, 2, 3, 4, 55, 6, 7, 8};
        int[] tableau2 = {1, 2, 3, 4, 55, 6, 7, 88};
        int[] tableau3 = {100, 2, 3, 4, 55, 6, 7, 8};

        assertEquals(55, FonctionsDiverses.maxTableau(tableau1));
        assertEquals(88, FonctionsDiverses.maxTableau(tableau2));
        assertEquals(100, FonctionsDiverses.maxTableau(tableau3));
    }
    @Test
    public final void minTableauTest(){
        int[] tableau1 = {1, 2, 3, 4, -55, 6, 7, 8};
        int[] tableau2 = {1, 2, 3, 4, 55, 6, 7, -88};
        int[] tableau3 = {-100, 2, 3, 4, 55, 6, 7, 8};

        assertEquals(-55, FonctionsDiverses.minTableau(tableau1));
        assertEquals(-88, FonctionsDiverses.minTableau(tableau2));
        assertEquals(-100, FonctionsDiverses.minTableau(tableau3));
    }
}
