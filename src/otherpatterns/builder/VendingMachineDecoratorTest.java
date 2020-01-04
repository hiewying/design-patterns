package otherpatterns.builder;

public class VendingMachineDecoratorTest {

    public static void main(String args[]){

        Beverage mocha = new Beverage.BeverageBuilder()
                .setId(1)
                .setName("Mocha")
                .setPrice(4)
                .build();
        System.out.println(mocha.toString());

    }
}


