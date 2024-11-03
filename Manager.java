package pertemuan11;

//materi overrd=iding
//subclass = Manager
public class Manager extends Employee {
    //properti khusus untuk Manager
    protected String department;

    //override  method work dengan perilaku khusus untuk  Manager
    Override
    public void work() {
        System.out.printf("%s is managing the %s department as a %s.%n", name, department, jobtitle);
    }

    //method tambahan lagi punya si Manager
    public void createReport() {
        System.out.printf("%s is creating a report for the %s department.%n", name, department);
    }
}