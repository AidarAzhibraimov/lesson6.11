package com.company;

public class Skeleton extends Boss{
    private int numberOrFarrows;
    public int getNumberOrFarrows() {
        return numberOrFarrows;
    }

    public void setNumberOrFarrows(int numberOrFarrows) {
        this.numberOrFarrows = numberOrFarrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + getNumberOrFarrows();
    }
}
