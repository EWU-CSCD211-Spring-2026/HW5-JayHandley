package model;

public class Arena {

    private int percentBlue;
    private int percentRed;

    public Arena(int percentBlue, int percentRed) {
        this.percentBlue = percentBlue;
        this.percentRed = percentRed;
    }

    public void increaseBlue(int percent) {
        if (this.percentBlue + percent < 100) {
            this.percentBlue = this.percentBlue + percent;
            System.out.println("Blue is at " + percent + " percent!");
        } else {
            this.percentBlue = 100;
            System.out.println("Blue won the game!");
        }
    }

    public void increaseRed(int percent) {
        if (this.percentRed + percent < 100) {
            this.percentRed = this.percentRed + percent;
            System.out.println("Red is at " + percent + " percent!");
        } else {
            this.percentRed = 100;
            System.out.println("Red won the game!");
        }
    }

    public int hashCode() {

        int res = this.percentBlue;
        res = 31 * res + this.percentRed;

        return res;
    }

}