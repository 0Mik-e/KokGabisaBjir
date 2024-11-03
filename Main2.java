package pertemuan11;

public class Main2 {
    public static void main(String[] args) {
        //membuat objek person
        Person person = new Person();
        person.name = "Alex";
        person.age = 10;
        person.introduce();
        person.work();

        System.out.println();

        //membuat objek Employee
        Employee employee = new Employee();
        employee.name = "Brian";
        employee.age = 28;
        employee.jobtitle = "Software Developer";
        employee.salary = 70000;
        employee.introduce(); //OVERRIDE method introduce dari Person
        employee.work(); //OVERRIDE method introduce sehingga beda dengan yang punya person
        employee.attendMeeting();

        System.out.println();

        //membut objekManager
        Manager manager = new Manager();
        manager.name = "Catherine";
        manager.age = 45;
        manager.jobtitle = "IT Manager"
        manager.salary = 120000;
        manager.department = "11";
        manager.introduce(); //memanggil method introduce dari Employees
        manager.work(); //OVERRIDE method work sehingga beda dengan yg punya Employee
        manager.attendMeeting(); //memanggilmethod yang diwariskan dari Employee
        manager.createReport(); //memanggil method khusus untuk manager
    }
}