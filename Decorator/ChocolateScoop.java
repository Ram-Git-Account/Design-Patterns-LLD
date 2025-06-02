package Decorator;

public class ChocolateScoop implements Icecream{
    private Icecream icecream;

    public ChocolateScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 65;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " ChocolateScoop ";
    }
}
