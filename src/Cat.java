class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "Cat";
    }

    @Override
    public void start() {
        System.out.println(getName() + " starts moving.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " stops moving.");
    }
}
