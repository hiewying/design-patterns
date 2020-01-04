package vendingmachine.decorator;

public class Tea extends Beverage {

    public Tea(String name){
        super(name);
        setPrice(12);
    }
    public void decorateBeverage(){
        System.out.println("Cost of: "+ name +": "+ price);
    }
}




