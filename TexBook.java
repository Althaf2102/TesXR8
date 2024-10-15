public class TexBook extends Book {
    String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public TexBook() {
        super();
        subject = "kosong";
    }

    public TexBook(String subject, String title, int year, double price) {
        super(title, year, price);
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Title:");
        System.out.println("Year:");
        System.out.println("Subject" + subject);
    }
}
