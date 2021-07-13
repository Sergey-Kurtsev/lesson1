package decorator;
//Паттерн декоратор, пиццы
public class Main {
    public static void main(String[] args) {
        Pizza peperoni = new PepperoniPizza();
        System.out.println(peperoni.getName());
        System.out.println(peperoni.getIngredients());
        Pizza peperoniMoreCheese = new MoreCheeseDecorator(peperoni);
        System.out.println(peperoniMoreCheese.getName());
        System.out.println(peperoniMoreCheese.getIngredients());
        Pizza peperoniMoreCheeseMoreSouse = new MoreSouseDecorator(peperoniMoreCheese);
        System.out.println(peperoniMoreCheeseMoreSouse.getName());
        System.out.println(peperoniMoreCheeseMoreSouse.getIngredients());
    }
}
