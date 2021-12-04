package generics.example1;

public class Person {

    private String document;
    private String name;

    public Person(String document, String name) {
        this.document = document;
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "document='" + document + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
