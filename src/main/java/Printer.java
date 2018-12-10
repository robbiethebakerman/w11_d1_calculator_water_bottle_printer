public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies) {
        if (pages * copies <= paper && pages * copies <= toner) {
            paper -= (pages * copies);
            toner -= (pages * copies);
        }
    }

    public void refill() {
        paper = 100;
    }
}
