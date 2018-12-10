import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    Printer printerLowPaper;
    Printer printerLowToner;

    @Before
    public void before(){
        printer = new Printer(10, 10);
        printerLowPaper = new Printer(10, 15);
        printerLowToner = new Printer(15, 10);
    }

    @Test
    public void hasPaper() {
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(10, printer.getToner());
    }


    @Test
    public void canPrint() {
        printer.print(3, 2);
        assertEquals(4, printer.getPaper());
        assertEquals(4, printer.getToner());
    }

    @Test
    public void cannotPrintIfPaperTooLow() {
        printerLowPaper.print(5, 3);
        assertEquals(10, printerLowPaper.getPaper());
        assertEquals(15, printerLowPaper.getToner());
    }

    @Test
    public void cannotPrintIfTonerTooLow() {
        printerLowToner.print(5, 3);
        assertEquals(15, printerLowToner.getPaper());
        assertEquals(10, printerLowToner.getToner());
    }

    @Test
    public void canRefill() {
        printer.refill();
        assertEquals(100, printer.getPaper());
    }
}
