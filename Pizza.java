public class Pizza{
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice =150;
    private int backPackPrice = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 400;
        }
        else{
            this.price = 500;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        this.price += extraToppingsPrice;
    }
    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPackPrice;

    }
    public void getBill(){
        String bill = "";
        System.out.println(" Pizza : "+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += " Extra cheese added : " +extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += " Extra Toppings added : " +extraToppingsPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill += " Take Away : " +backPackPrice+ "\n";
        }
        bill += " Bill : "+this.price + "\n";
        System.out.println(bill);
    }

    public class DeluxPizza extends Pizza{
        public DeluxPizza(Boolean veg){
            super(veg);
            super.addExtraCheese();
            super.addExtraToppings();
        }
        public void addExtraCheese(){
            super.addExtraCheese();
        }
        public void addExtraToppings(){
            super.addExtraToppings();
        }

    }
    public static void main (String[] args){
        Pizza basePizza = new Pizza(true);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        //DeluxPizza dp = new DeluxPizza(veg);
        //dp.takeAway();
        //dp.getBill();
    }
}
