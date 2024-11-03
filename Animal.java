package pertemuan11;

//ini adalah superclass atau parent class yaitu Animal
public class Animal {
    //properti atau atribut dari class animal
    String name;
    int age;

    //method dari animal
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + "is sleeping.");
    }

    public void checkAge() {
        if (age < 1) {
            System.out.println(name + "is  a baby  animal  because," + name + " is " + age + "years old");
        } else if (age < 5) {
            System.out.printf("%s is young animal because %s is %d years old.%n", name, name, age);
        } else {
            System.out.printf("%s is a young animal because %s is %d years old.%n", name, name, age);
        }
    }
}
