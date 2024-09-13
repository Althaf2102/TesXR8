public class Product{
   protected int Number;
   protected String Name;
   protected int quantity;
   protected double price;

   public int getNumber() {
      return this.Number;
   }

   public void setNumber(int Number) {
      this.Number = Number;
   }

   public String getName() {
      return this.Name;
   }

   public void setName(String Name) {
      this.Name = Name;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

 public Product(){
    Number = 0;
    Name = "";
    quantity = 0;
    price = 0.0;
 }

 public Product(int Number, String Name, int quantity, double price){
this.Number = Number;
this.Name = Name;
this.quantity = quantity;
this.price = price;

}  
}

