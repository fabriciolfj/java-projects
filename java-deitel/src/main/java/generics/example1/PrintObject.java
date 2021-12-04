package generics.example1;

public class PrintObject<T> {

    public void execute(T value) {
        System.out.println("Object: " + value.toString());
    }
}
