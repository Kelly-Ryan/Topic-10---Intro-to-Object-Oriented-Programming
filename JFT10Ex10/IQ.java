public class IQ{

    private String name;
    private int age;
    private float iQScore;

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age) {

        if(age >= 1 && age <= 115){

            this.age = age;

        } else {

            this.age = 0;
        }
    }

    public void setIQScore(float iq){

        if(iq >= 1 && iq <= 200) {

            this.iQScore = iq;

        } else {

            this.iQScore = 0;
        }
    }

    public String getName(){

        return name;
    }

    public int getAge() {

        return age;
    }

    public float getIQScore(){

        return iQScore;
    }

    public String IQReport(){

        String s = "";

        if(iQScore < 100){

            s = "Your score of " + iQScore + " is below average.";

        } else if(iQScore >= 100 && iQScore <= 150) {

            s = "Your score of " +iQScore + " is above average.";

        } else if(iQScore > 150) {

            s = "Your score of " + iQScore + " is exceptional.";

        }

        return s;

    }

    public String toString(){

        return "Name: " + getName() + "\t" + "Age: " + getAge() + "\t" + "IQ Score: " + getIQScore();

    }

}