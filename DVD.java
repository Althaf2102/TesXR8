
public class DVD {
    protected int length;
    protected String rating;
    protected String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD() {
        super();// mengakses constructor superclass
        length = 0;
        rating = "";
        studio = "";
    }

    public DVD(int Number, String Name, int quantity, double price, int length, String rating, String studio) {
        super();
        this.length = length;
        this.rating = rating;
        this.studio = studio;

    }

    public void print() {
        System.out.println("Length : " + length);
        System.out.println("Rating :" + rating);
        System.out.println("Studio :" + studio);
    }
}
