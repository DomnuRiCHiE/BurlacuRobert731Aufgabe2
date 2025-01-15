package Model;

public class Medikamente {
    private String name;
    private int price;
    private String disease;

    public Medikamente(String name, int price, String disease) {
        this.name = name;
        this.price = price;
        this.disease = disease;
    }

    public Medikamente() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Medikamente{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", disease='" + disease + '\'' +
                '}';
    }
}
