public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Сейчас в миске " + foodAmount + " еды.");
        }
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            foodAmount = 0;
        }
    }
}
