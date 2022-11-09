import java.util.Arrays;
import java.util.Comparator;

public class Array_Book {//按price大到小小到大排序，按照书名长度从大到小排序
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("红楼梦",200);
        book[1] = new Book("水浒传",400);
        book[2] = new Book("三国",300);
        book[3] = new Book("西游记",100);
        Arrays.sort(book, new Comparator() {//重写价格排序
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book1.getPrice() - book2.getPrice();//正反相反
            }
        });

        Arrays.sort(book, new Comparator() {//重写名称排序
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book1.getName() - book2.getName();//正反相反
            }
        });
//        System.out.println(Arrays.toString(book));
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }
 }

class Book{
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public int getName() {
        return name.length();
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
}