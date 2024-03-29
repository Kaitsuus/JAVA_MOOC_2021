
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class TehtavienhallintaTest {

    private Tehtavienhallinta hallinta;

    @Before
    public void alusta() {
        hallinta = new Tehtavienhallinta();
    }

    @Test
    public void tehtavalistaAlussaTyhja() {
        assertEquals(0, hallinta.tehtavalista().size());
    }
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {;
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }
    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
    }
    @Test
    public void TehdyksiMerkkaamatonEiOleTehty() {
        hallinta.lisaa("Uusi tehtava");
        hallinta.merkkaaTehdyksi("Uusi tehtava");
        assertFalse(hallinta.onTehty("Joku tehtava"));
    }

}
