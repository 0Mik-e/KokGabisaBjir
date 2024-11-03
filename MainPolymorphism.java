package pertemuan11;

public class MainPolymorphism {
    public static void main (String[] args) {
        //menggunakan polymorphism
        Vechile car2 = new Car("Toyota", "Corolla", 2019, 4);
        car2.introduce(); //memanggil metode dari vechile yang dioverride di Car
        car2.speed();
        //car2.carinfo(); kita gabisa akses metode yang ada di car (hanya bisa diakses metode pada vechile)
        //karena kita simpannta di vehicle bukan di car

        //Car car3 = new Vechile("Honda", "Civic"); //ini akan menyebabkan kesalahan
        //tidak bisa membuat objek vehicle dan simpan di car
        //karena belum tentu "Vehicle itu bagian dari car" tetapi "Car pasti bagian dari vehicle"
    }
}
