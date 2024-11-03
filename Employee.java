package pertemuan11;

//materi overriding
//subclass = Employee

public class Employee extends Person {
    //properti khusus employee
    protected String jobtitle;
    protected double salary;

    Override
    public void introduce() {
        System.out.printf("Hello, my name is %s%n", name);
    }

    //override method buat employee 
    Override
    public void work() {
        System.out.printf("%s is  working as a %s with a salary of $%.2f.%n", name, jobtitle,salary);
    }

    //method tambahan atau method khusus pada employee
    public void attendMeeting() {
        System.out.printf("%s  is attending a meeting.%n", name);
    }
}