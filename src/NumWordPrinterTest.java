import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumWordPrinterTest {
    @Test
    public void testEvenPrimeLucky()
    {
        NumWordPrinter printer=new NumWordPrinter();
        String result=printer.printWord(286,false);
        assertEquals("EvenPrimeLucky", result);

    }

    @Test
    public void testPrimeElven()
    {
        NumWordPrinter printer=new NumWordPrinter();
        String result=printer.printWord(11,false);
        assertEquals("PrimeEleven",result);
    }


    @Test
    public void testOddOneOut()
    {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(7, false);
        assertEquals("OddOneOut", result);
    }

    @Test
    public void testEvenWithUpperCase() {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(4, true);
        assertEquals("EVEN", result);
    }
}


}