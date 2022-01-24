import java.util.*;
public class Person {
    String firstName;
    String lastName;
    String ID;
    String title;
    int YOB;

    public Person(){
    }

    public Person(String fName, String lName, String id, String titleIN, int yob){
        firstName = fName;
        lastName = lName;
        ID = id;
        title = titleIN;
        YOB = yob;
    }

    public String fullName(){
        return firstName + " " + lastName;
    }

    public String formalName(){
        return title + fullName();
    }

    public String getAge(){
        Calendar calendar = Calendar.getInstance();
        return ((calendar.get(Calendar.YEAR)) - YOB) + "";
    }

    public String getAge(int year){
        return (year - YOB) + "";
    }

    public String toCSVDataRecord(){
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

}
