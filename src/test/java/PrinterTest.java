import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(20, 20, 5);
    }

    @Test
    public void hasPaper(){
        assertEquals(20, printer.getNumOfSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(20, printer.getTonerVolume());
    }

    @Test
    public void canPrintPaperTest(){
        printer.printPaper();
        assertEquals(15, printer.getNumOfSheets());
    }

    @Test
    public void canPrintTonerTest(){
        printer.printPaper();
        assertEquals(19, printer.getTonerVolume());
    }
}
