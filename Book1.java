package chuong2;

public class Book1 {
    String name;
    Author[] authors;
    double price;
    int qty;

    public Book1(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book1(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        return authorNames.toString().substring(0, authorNames.length() - 2); // Remove trailing comma and space
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=[" + getAuthorNames() + "], price=" + price + ", qty=" + qty + "]";
    }
}
