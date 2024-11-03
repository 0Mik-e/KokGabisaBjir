package pertemuan11;

//materi overriding
//superclass atau parent class = person
public class Person {
    //properti / atribut dari Person
    protected String name;
    protected int age;

    //method introduce
    public void introduce() {
        System.out.printf("Hello, my name is %s and I am %d years olf.%n", name, age);
    }

    //method work Person
    public void work() {
        System.out.printf("%s is working on a general task. %n", name);
    }
}