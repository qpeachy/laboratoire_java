import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SourisTest {
    @Test
    public void testVieillir() {   
        Souris sOriginal = new Souris(10, "bleue", 20); 
        Souris sClone = new Souris(sOriginal);
        sClone.vieillir();
        assertEquals("verte",sClone.get_couleur());
    }

    @Test
    public void testEvo() {   
        Souris sOriginal = new Souris(10, "bleue", 5); 
        Souris sClone = new Souris(sOriginal);
        sClone.evolue();
        sClone.vieillir();
        assertEquals("verte",sClone.get_couleur());
    }
}  
