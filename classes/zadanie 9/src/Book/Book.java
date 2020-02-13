package Book;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publ;
    private int year;
    private int amount_str;
    private int cost;
    private String type_per;

    public Book(int id, String name, String author, String publ, int year, int amount_str, int cost, String type_per) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publ = publ;
        this.year = year;
        this.amount_str = amount_str;
        this.cost = cost;
        this.type_per = type_per;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubl() {
        return publ;
    }

    public void setPubl(String publ) {
        this.publ = publ;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount_str() {
        return amount_str;
    }

    public void setAmount_str(int amount_str) {
        this.amount_str = amount_str;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType_per() {
        return type_per;
    }

    public void setType_per(String type_per) {
        this.type_per = type_per;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publ='" + publ + '\'' +
                ", year=" + year +
                ", amount_str=" + amount_str +
                ", cost=" + cost +
                ", type_per='" + type_per + '\'' + "\n";
    }
}
