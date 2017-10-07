/**
 * Created by Grant on 10/7/2017.
 */
public class Book {
    private long ISBN; //unique ISBN of book
    private float price; //market price of book in USD based off Amazon
    private int condition; //integer from 1-4, corresponding to poor, fair, good, new in that order
    private String picture;

    Book(long ISBN, float price, int condition, String picture) {
        this.ISBN = ISBN;
        this.price = price;
        this.condition = condition;
        this.picture = picture;
    }

    long getISBN() {
        return this.ISBN;
    }

    float getPrice() {
        return this.price;
    }

    int getCondition() {
        return this.condition;
    }

    String getPicture() {
        return this.picture;
    }
}
