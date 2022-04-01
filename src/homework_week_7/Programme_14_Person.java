package homework_week_7;

public class Programme_14_Person {

    //Instance variables
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_Person  person = new Programme_14_Person();
        person.setFirstName("");
        person.setlastName("");
        person.setAge(10);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setFirstName("John");//firstName is set to John
        person.setAge(18);
        System.out.println("fullname=" + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setlastName("Smith");//lastname is set to smith
        System.out.println("fullName= " + person.getFullName());
    }

    //Get Firstname Method
    public String getFirstName() {
        return firstName;
    }

    //Get Lastname Method
    public String getLastName() {
        return lastName;
    }

    // Get age Method
    public int getAge() {
        return age;
    }

    //Set FirstName Method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Set Lastname Method
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    // Set age Method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //check is Teen or not Method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    //Get Full name Method
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return getLastName();
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}
