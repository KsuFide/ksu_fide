public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;

    // Конструктор без аргументов
    // Просто кошка - это серый Барсик
    public Cat() {
        weight = 3000;
        name = "Barsik";
        age = 1;
        color = "Grey";
    }

    // Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat() {
        this.weight += 50;
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        System.out.println("Name: " + barsik.name);
        System.out.println("Weight: " + barsik.weight);

        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        System.out.println("Name: " + bigCat.name);
        System.out.println("Weight: " + bigCat.weight);

        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        System.out.println("Name: " + smallCat.name);
        System.out.println("Weight: " + smallCat.weight);
    }
}