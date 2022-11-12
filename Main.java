public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Rex";
        dog.weight = 25.3;

        System.out.println("Masz psa, nazywa się:");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        Animal cat = new Animal("british");
        cat.name = "kot";
        cat.weight = 5.0;

        System.out.println("Masz kota, nazywa się:");
        System.out.println(cat.name);
        System.out.println(cat.isAlive);
        System.out.println(cat.species);

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat.weight);
        cat.feed();
        cat.takeForAWalk();

    }
}