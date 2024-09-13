public class CD extends Product {
   protected String artist;
  protected int numSong;
  protected String label;

  public String getArtist() {
    return this.artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public int getNumSong() {
    return this.numSong;
  }

  public void setNumSong(int numSong) {
    this.numSong = numSong;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }
  
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
