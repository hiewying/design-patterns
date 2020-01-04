package vendingmachine.decorator;

public class CaramelDecorator extends BeverageDecorator{
    public CaramelDecorator(Beverage beverage){
        super(beverage);
    }
    public void decorateBeverage(){
        super.decorateBeverage();
        decorateCaramel();
    }
    public void decorateCaramel(){
        System.out.println("Added Caramel to: "+beverage.getName());
    }
    public int getIncrementPrice(){
        return 6;
    }
    public String getDecoratedName(){
        return "Caramel";
    }
}


