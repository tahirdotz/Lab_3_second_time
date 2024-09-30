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


}