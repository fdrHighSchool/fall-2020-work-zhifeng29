
public class Lifespan {
  // instance variables
  private String name;
  private int agelimit;
  private int currentage;
  //------------------------------------------------//
  // constructor
  public Lifespan(String n,int c,int l) {
    this.name = n;
    this.currentage = c;
    this.agelimit = l;

  }//end constructor method
  //------------------------------------------------//
  public String getName() {
    return this.name;
  }//end getName method

  public int getCurrentage() {
    return this.currentage;
  }//end getAgelimit method

  public int getAgelimit() {
    return this.agelimit;
  }//end getAgelimit method
  public double percent() {
    double ans = (double)this.currentage/(double)this.agelimit;
    return ans;
  }//end getAgelimit method

  public String toString() {
    return "Name: " + this.name + " CurrentAge: " + this.currentage + " Agelimit: " + this.agelimit;

  }//end toString method



}//end of class
