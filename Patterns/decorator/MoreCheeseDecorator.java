package decorator;


public class MoreCheeseDecorator extends PizzaDecorator {
    Pizza pizza;

    public MoreCheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + " with additional cheese";
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients() + ", more cheese";
    }
}
