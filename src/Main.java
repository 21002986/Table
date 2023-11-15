public class Main{
    String name;
    int yearOfJoining;
    String address;

    public Main(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t\t" + address);
    }
    public void displayInfoo() {
        System.out.println(name + "\t\t\t" + yearOfJoining + "\t\t\t" + address);
    }

    public static void main(String[] args) {
        Main employee1 = new Main("Sairam", 2001, "64C- WallsStreat");
        Main employee2 = new Main("Ram", 2005, "68D- WallsStreat");
        Main employee3 = new Main("Siva", 2004, "26B- WallsStreat");

        System.out.println("Name\t\tYear of joining\tAddress");
        employee1.displayInfo();
        employee2.displayInfoo();
        employee3.displayInfo();
    }
}
