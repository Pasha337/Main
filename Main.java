public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        dog1.run(700);
        dog1.swim(5);
        Dog dog2 = new Dog("Чома");
        dog2.run(300);
        dog2.swim(5);
        Cat cat1 = new Cat("Мурзик");
        cat1.run(100);
        cat1.swim(0);
        Cat cat2 = new Cat("Барсик");
        cat2.run(300);
        cat2.swim(0);

        Bowl bowl = new Bowl(40);

        System.out.println("В миске " + bowl.getFoodAmount() + " еды.");

        cat1.eat(bowl, 20);
        cat2.eat(bowl, 20);

        System.out.println("Сытость котов:");
        System.out.println(cat1.name + " сыт: " + cat1.isFull());
        System.out.println(cat2.name + " сыт: " + cat2.isFull());

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        bowl.addFood(40);
        System.out.println("В миске " + bowl.getFoodAmount() + " еды.");
    }
}
