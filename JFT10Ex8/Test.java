public class Test {

    public static void main (String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.firstName = "Billy";
        s1.lastName = "Davis";
        s1.age = 17;
        s1.className = "Leaving Cert 1";
        s1.gradeAverage = 70.50f;
        s1.address = "12 High Street, Dublin";

        s2.firstName = "Anna";
        s2.lastName = "Smith";
        s2.age = 18;
        s2.className = "Leaving Cert 1";
        s2.gradeAverage = 80.00f;
        s2.address = "19 Lower Street, Dublin";

        s3.firstName = "Georgina";
        s3.lastName = "Moriarty";
        s3.age = 17;
        s3.className = "Leaving Cert 1";
        s3.gradeAverage = 90.00f;
        s3.address = "5 Middle Street, Dublin";

        System.out.println(s1.toString() + "\n" + s2.toString() + "\n" + s3.toString());
        System.out.println("There are: " + Student.getStudentObjectCount() + " students.");
        System.out.println("The average student grade for the class is: " + ((s1.gradeAverage + s2.gradeAverage + s3.gradeAverage)/Student.getStudentObjectCount()));


    }
}