package pertemuan11;

//materi super dan constructor
//superclass = Vechile
public class Vechile {
    //atribut dasar dari Vechile
    private String brand;
    private String model;
    private int year;

    //konstruktor untuk vechile
    public Vechile(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    
    public String setModel() {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    //method untuk memperkenalkan kendaraan
    public void introduce() {
        System.out.printf("this is a %d %s %s.%n", year, brand, model);
    }

    public void speed() {
        System.out.println("The vechile is moving");
    }
}