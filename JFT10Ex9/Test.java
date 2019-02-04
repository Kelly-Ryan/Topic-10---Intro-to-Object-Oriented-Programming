public class Test {

    public static void main(String[] args)

    {

        Smartphone phone1 = new Smartphone();
        Smartphone phone2 = new Smartphone();
        Smartphone phone3 = new Smartphone();

        phone1.name = "Nooks 610";
        phone1.manufacturer = "Nooks";
        phone1.price = 100.00f;
        phone1.releaseDate = "04/06/2008";
        phone1.creditRemaining = 0.00f;
        phone1.isFullyCharged = false;

        Smartphone.noOfSmartphones++;
        Smartphone.sumOfPrices += phone1.price;

        phone2.name = "H3C Sensation 610";
        phone2.manufacturer = "H3C";
        phone2.price = 110.00f;
        phone2.releaseDate = "14/07/2012";
        phone2.creditRemaining = 0.00f;
        phone2.isFullyCharged = false;

        Smartphone.noOfSmartphones++;
        Smartphone.sumOfPrices += phone2.price;

        phone3.name = "Simsung Desire";
        phone3.manufacturer = "Simsung";
        phone3.price = 190.00f;
        phone3.releaseDate = "14/07/2015";
        phone3.creditRemaining = 0.00f;
        phone3.isFullyCharged = false;

        Smartphone.noOfSmartphones++;
        Smartphone.sumOfPrices += phone3.price;


        phone1.topUpCredit(15);

        System.out.println(phone1.toString() + "\n" + phone2.toString() + "\n" + phone3.toString());
        System.out.println("There are " + Smartphone.getNoOfPhones() + " smartphones.");
        System.out.println("The average price of a smartphone is " + Smartphone.getAveragePrice());

    }

}