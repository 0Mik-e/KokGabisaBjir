package pertemuan11;

//materi super dan constructor
//subclass = Truck
public class Truck extends Vechile {

    private double loadCapacity;

    public Truck(String brand, String model, int year, double loadCapacity) {
        //memanggil konstruktor dari superclass vechile
        super(brand, model, year);
        this.loadCapacity = loadCapacity; //mengatur kapasitas muatan
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity() {
        this.loadCapacity = loadCapacity;
    }

    //override method speed dari Vedchile
    Override
    public void speed() {
        System.out.println("the truck is hauling.");
    }
    
    //method utk informasi truk
    public void truckInfo() {
        introduce(); //memanggil introduce dari vechile
        System.out.printf("It has a load capacity of %.2f tons.%n", loadCapacity);
    }
}