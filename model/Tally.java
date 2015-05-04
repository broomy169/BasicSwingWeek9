package model;

/**
 * Created by jc258876 on 4/05/15.
 */
public class Tally {
    private int value = 0;

    public void increment() {
        value++;
    }

    public void reset() {
        value = 0;
    }

    public String toString(){
        return ("Tally: " + value);
    }
}
