package pl.it.akademia.typy.wyliczeniowe;

public class App {
    public static void main(String[] args) {
        Employee e = new Employee(
                1,
                "Mateusz",
                "Bereda",
                1000,
                Employee.Posiotion.MID);

        //??

        //??

        e.setPosition(Employee.Posiotion.HIGH);

        Employee.Posiotion p = Employee.Posiotion.HIGH;
        Employee.Posiotion p2 = Employee.Posiotion.LOW;
        Employee.Posiotion p3 = Employee.Posiotion.MID;
        String position = "MID";
        Employee.Posiotion p4 = Employee.Posiotion.valueOf(position);
        System.out.println(p4);

        Employee.Posiotion[] values = Employee.Posiotion.values();
        for(Employee.Posiotion posiotion2 : values) {
            System.out.println(posiotion2);
        }

        Employee e2 = new Employee(
                1,
                "Mateusz",
                "Bereda",
                1000,
                Employee.Posiotion.MID);
        Employee.A a = new Employee.A();

        Console console1 = Console.PS1;
        Console console2 = Console.PS1;

        System.out.println(console1.getSpeed());
        System.out.println(console2.getSpeed());

        console1.setSpeed(1000);

        System.out.println(console1.getSpeed());
        System.out.println(console2.getSpeed());
        Console console3 = Console.PS1;
        System.out.println(console3.getSpeed());

        if(console1 == Console.PS1) {
            System.out.println("takie same !!");
        }
    }
}
