package generics.example1;

public class Simulacao {

    public static void main(String[] args) {
        var peson = new Person("Fabricio", "339875999");
        var formt = new FormatDocument<Person>();
        formt.execute(peson);
    }
}
