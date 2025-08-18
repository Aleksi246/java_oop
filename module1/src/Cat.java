public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat cat = new Cat("Whiskers");
        //another cat created
        Cat cat2 = new Cat("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        //call the meow again
        cat.meow();
        //call the mewo for cat2
        cat2.meow();
        //first cat meows again
        cat.meow();

    }
}