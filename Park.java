public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Park.Attraction attraction1 = park.new Attraction("Американские горки", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Колесо обозрения", "09:00 - 21:00", 300);

        attraction1.printAttractionInfo();
        System.out.println();
        attraction2.printAttractionInfo();
    }
}
