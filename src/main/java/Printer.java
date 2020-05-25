public class Printer {

    private int numOfSheets;
    private int tonerVolume;
    private int numOfPagesToPrint;

    public Printer(int numOfSheets, int tonerVolume, int numOfPagesToPrint){
        this.numOfSheets = numOfSheets;
        this.tonerVolume = tonerVolume;
        this.numOfPagesToPrint = numOfPagesToPrint;
    }

    public boolean checkPaper(){
        if (this.numOfSheets >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void printPaper(){
        boolean paperTrue = checkPaper();
        if (paperTrue = true) {
            this.numOfSheets -= this.numOfPagesToPrint;
            this.tonerVolume -= 1;
        }
    }

    // GETTERS AND SETTERS

    public int getNumOfSheets(){
        return this.numOfSheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }
}
