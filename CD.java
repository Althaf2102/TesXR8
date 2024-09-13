public class CD extends Product {
    String artist;
    int numSong;
    String label;
  
    public CD(){
      super();//mengakses constructor superclass
      artist = "";
      numSong = 0;
      label = "";
}

public CD(int Number,String Name,int quantity,double price,String artist, int numSong, String label){
  super(Number,Name,quantity,price);
  this.artist = artist;
  this.numSong = numSong;
  this.label = label;
}
}
