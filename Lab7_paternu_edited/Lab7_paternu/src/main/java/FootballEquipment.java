public class FootballEquipment {

    private String name;
    private String type;
    private double price;

    //Конструктор
    public FootballEquipment(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    //Гетери
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    //Перевизначення методу toString
    @Override
    public String toString() {
        return "FootballEquipment{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
