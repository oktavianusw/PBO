
abstract class Animal {
    protected String name;
    protected int age;
    protected String food;
    protected String gender;
    protected int alive;

    public Animal(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    public abstract String printSound();

    public boolean isAlive() {
        return alive == Status.ALIVE;
    }

    public String printData() {
        return "Jenis: " + this.getClass().getSimpleName() +
                ", Nama: " + name +
                ", Umur: " + age +
                ", Makanan: " + food +
                ", Jenis Kelamin: " + gender +
                ", Status: " + (isAlive() ? "Hidup" : "Mati");
    }
}

interface Status {
    int ALIVE = 1;
    int DEAD = 0;
}

class Cat extends Animal {
    public Cat(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Miawww";
    }
}

class Dog extends Animal {
    public Dog(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Gukkgukk";
    }
}

class Duck extends Animal {
    public Duck(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Qwekk";
    }
}

class Horse extends Animal {
    public Horse(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Hiihhh";
    }
}

public class Modul2_1122007_WaluyaJuangH {
    public static void main(String[] args) {
        Cat cat = new Cat("Luca", 3, "Ikan", "Male", Status.ALIVE);
        Dog dog = new Dog("Blacky", 4, "Daging", "Male", Status.ALIVE);
        Duck duck = new Duck("Donald", 2, "Dedak", "Male", Status.DEAD);
        Horse horse = new Horse("Unicorn", 5, "Rumput", "Female", Status.ALIVE);

        System.out.println(cat.printData());
        System.out.println("Suara: " + cat.printSound());
        System.out.println();

        System.out.println(dog.printData());
        System.out.println("Suara: " + dog.printSound());
        System.out.println();

        System.out.println(duck.printData());
        System.out.println("Suara: " + duck.printSound());
        System.out.println();

        System.out.println(horse.printData());
        System.out.println("Suara: " + horse.printSound());
        System.out.println();
    }
}
