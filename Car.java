package pertemuan11;

//materi Super dan konstruktor
//subclass = Car
public class Car extends Vechile {
    //atribut khusus untuk Car
    private int doors;

    //konstruktor Car
    public Car(String brand, String model, int year, int doors) {
        //memanggil konstruktor dari superclass vechile
        super(brand, model, year);
        this.doors = doors; //atribut jumlah pintu milik Car
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    //override method speed dari vechile
    public void speed() {
        System.out.println("The car is driving.");
    }

    //method utk informasi mobil
    public void carInfo() {
        introduce(); //memanggil metodi introduce dari vechile
        System.out.printf("It has %d doors", doors);
    }
}