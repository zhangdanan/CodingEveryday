package domain;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 10:28 2019/7/30
 * @Modificd By;
 */
public class Book {
    private String bookName;
    private String price;
    private String bookId;

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price='" + price + '\'' +
                ", bookId='" + bookId + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
