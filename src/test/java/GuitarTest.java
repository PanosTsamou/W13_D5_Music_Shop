import com.codeclan.example.instruments.Guitar;
import com.codeclan.example.instruments.InstrumentTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void seetUp(){
        guitar = new Guitar(350,240,"Guitaroti",2015,"wood",
                InstrumentTypes.STRING,"Black", 7, "Acoustic", true);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(350,guitar.getSellingPrice(),.0);
    }
    @Test
    public void hasBuyingPrice(){
        assertEquals(240, guitar.getBuyingPrice(), .0);
    }
    @Test
    public void hasBrand(){
        assertEquals("Guitaroti", guitar.getBrand());
    }
    @Test
    public void hasYearOfConstraction(){
        assertEquals(2015, guitar.getYear());
    }
    @Test
    public  void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }
    @Test
    public void hasTypeOfInstrument(){
        assertEquals("string", guitar.getType());
    }
    @Test
    public void hasColour(){
        assertEquals("Black", guitar.getColour());
    }
    @Test
    public void hasNumberOfStrings(){
        assertEquals(7, guitar.getNumberOfStrings());
    }
    @Test
    public void hasTypeOfGuitar(){
        assertEquals("Acoustic", guitar.getTypeOfGuitar());
    }
    @Test
    public void includesKey(){
        assertEquals(true, guitar.isContainsKey());
    }
    @Test
    public void playMusic(){
        assertEquals("drin drin", guitar.play());
    }
    @Test
    public void hasAMarkUp(){
        assertEquals("45.83%" , guitar.getMarkupAsString());
    }
    @Test
    public void hasProfit(){
        assertEquals(110, guitar.getProfit(),.0);
    }
}
