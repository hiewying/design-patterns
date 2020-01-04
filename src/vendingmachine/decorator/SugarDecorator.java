package vendingmachine.decorator;

public class SugarDecorator extends BeverageDecorator{
    public SugarDecorator(Beverage beverage){
        super(beverage);
    }
    public void decorateBeverage(){
        super.decorateBeverage();
        decorateSugar();
    }
    public void decorateSugar(){
        System.out.println("Added Sugar to: "+beverage.getName());
    }
    public int getIncrementPrice(){
        return 3;
    }
    public String getDecoratedName(){
        return "Sugar";
    }
}


