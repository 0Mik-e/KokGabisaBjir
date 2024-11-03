package pertemuan11;

public class Main3 {
    public static void main(String[] args) {
        //membuat objek car
        Car car = new Car("Tesla", "Model S", 2022, 4);
        car.carInfo();
        car.speed();

        //set buat ubah
        car.setModel("Model 3");
        car.setYear(2023);
        car.setDoors(2);

        System.out.println("Updated Car Information :");
        car.carInfo(); //menampilkan  informasi mobil yang diperbaharui

        System.out.println("\n");

        //membuat objek Truck
        Truck truck = new Truck("ford", "F 150", 2023, 2.5);
        truck.truckInfo();
        truck.speed();

        truck.setLoadCapacity(3.0);
        System.out.println("Updated truck information :");
        truck.truckInfo();
    }
}