package decorator;

public class MoreSouseDecorator extends PizzaDecorator {
    Pizza pizza;

    public MoreSouseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + " with additional souse";
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients() + ", more souse";
    }
}
