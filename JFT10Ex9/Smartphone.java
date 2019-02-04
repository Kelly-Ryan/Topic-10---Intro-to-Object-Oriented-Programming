public class Smartphone {

  public String name;
  public String manufacturer;
  public float price;
  public String releaseDate;
  public float creditRemaining;
  public boolean isFullyCharged;

  static float sumOfPrices;
  static float noOfSmartphones;

    public void makeCall(String noToCall){

        System.out.println("Dialling number: " + noToCall);
    }

    public void topUpCredit(float topUpAmount) {

        creditRemaining += topUpAmount;
        System.out.println("You have successfully topped up by :" + topUpAmount + "\n" + "Your new balance is: " + creditRemaining);
    }

    public void charge() {

        isFullyCharged = true;
        System.out.println("The smartphone is now fully re-charged.");
    }

    public String toString() {

        return "Name: " + name + "\n" + "Manufacturer: " + manufacturer + "\n" + "Price: " + price + "\n" +
                "Release Date: " + releaseDate + "\n" + "Credit Remaining: " + creditRemaining + "\n" +
                "Charge Status: " + isFullyCharged + "\n";

    }

    public static float getNoOfPhones(){

        return noOfSmartphones;
    }

    public static float getAveragePrice(){

        return sumOfPrices / noOfSmartphones;
    }

}