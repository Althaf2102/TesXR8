import java.util.Scanner;
import java.util.Scanner;
public class Novel extends Book {
    String Genre;

Scanner s = new Scanner(System.in);

    public String getGenre() {
        return this.Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Novel() {
        super();
        Genre = "Drama";
    }

    public Novel(String Genre, String title, int year, double price) {
        super();
        this.Genre = Genre;
    }

    public void print() {
        super.print();
        System.out.println("Title:");
        title = s.nextLine();
        System.out.println("Year");
        year = s.nextInt();
        System.out.println("Price:");
        price = s.nextDouble();
        System.out.println("Genre:" + Genre);
    }
}
