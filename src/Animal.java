abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract String getType();

    String getName() {
        return name;
    }
}
