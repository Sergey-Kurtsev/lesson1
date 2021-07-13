package singletone;

public final class Singletone {
int id;
static Singletone name;
private Singletone(int id) {
    this.id = id;
}
public static Singletone getInstance(int id) {
    if (name == null) {
        name = new Singletone(id);
        System.out.println(id);
    }
    return name;
}

}
