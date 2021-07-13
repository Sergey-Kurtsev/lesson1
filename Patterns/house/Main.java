package house;
//Паттерн билдер, дома
public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        HouseBuilderDirector director = new HouseBuilderDirector(builder);
        House house1 = director.construct();
        System.out.println(house1);
    }
}
