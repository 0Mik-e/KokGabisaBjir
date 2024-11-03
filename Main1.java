package pertemuan11;

public class Main1 {
    public static void main(String[] args) {
        //buat objek dari subclass Dog
        Dog myDog = new Dog();

        //mengatur properti atau atribut yang DIWARISI dari Animal
        myDog.name = "Buddy";
        myDog.age = 6;

        //memanggil method yang ada diwarisi dari Animal
        System.out.println("PUNYA ANIMAL");
        myDog.eat();
        myDog.sleep();
        myDog.checkAge();

        //memanggil method dari subclass itu sndiri
        System.out.println("\nPUNYA DOG");
        myDog.bark();
    }
}