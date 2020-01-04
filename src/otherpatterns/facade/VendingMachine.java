package otherpatterns.facade;

public class VendingMachine {

    private Beverage coffee;
    private Beverage tea;
    private Beverage pepsi;

    public  VendingMachine(){
        coffee = new Coffee();
        tea = new Tea();
        pepsi = new Pepsi();
    }

    public void makeCoffee(){
        coffee.prepare();
    }

    public void makeTea(){
        tea.prepare();
    }

    public void makePepsi(){
        pepsi.prepare();
    }
}


