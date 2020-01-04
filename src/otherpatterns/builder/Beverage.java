package otherpatterns.builder;

public class Beverage {

    protected final long id;
    protected final String name;
    protected final int price;

    public Beverage(long id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static class BeverageBuilder {

        protected long id;
        protected String name;
        protected int price;

        public BeverageBuilder() {
        }

        public BeverageBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public BeverageBuilder setName(String name) {
            this.name = name;
            return this;
        }

        protected BeverageBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Beverage build() {
            return new Beverage(id, name, price);

        }

        public String toString() {
            return "id = " + this.id + ", name = " + this.name +
                    ", price = " + this.price;
        }
    }

}



