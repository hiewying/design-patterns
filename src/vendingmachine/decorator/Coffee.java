package vendingmachine.decorator;

public class Coffee extends Beverage{
    public Coffee(String name){
        super(name);
        setPrice(20);
    }
    public void decorateBeverage(){
        System.out.println("Cost of: "+ name +": "+ price);
    }
}







