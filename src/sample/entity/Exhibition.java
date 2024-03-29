package sample.entity;

public class Exhibition {
    private int id;
    private String name;
    private String date;
    private int price;
    private int exhibits_id;

    public Exhibition() {
    }

    public Exhibition(String name, String date, int price, int exhibits_id) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.exhibits_id = exhibits_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getExhibits_id() {
        return exhibits_id;
    }

    public void setExhibits_id(int exhibits_id) {
        this.exhibits_id = exhibits_id;
    }

    @Override
    public String toString() {
        return "Exhibition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", exhibits_id=" + exhibits_id +
                '}';
    }
}
