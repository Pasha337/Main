public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            this.isFull = true;
            System.out.println(name + " поел, сытость = " + this.isFull);
        } else {
            System.out.println(name + " не хватило еды.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }
}