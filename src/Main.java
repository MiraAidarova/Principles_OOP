public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.model = "ASUS";
        computer.processor = "intel core i7";
        computer.memory = "16 GB";
        computer.HDD = "512 GB";
        computer.price = "90 000₽";

        System.out.println(computer.model);
        System.out.println(computer.processor);
        System.out.println(computer.memory);
        System.out.println(computer.HDD);
        System.out.println(computer.price);

        Computer computer1 = new Computer1();
        computer1.model = "HP";
        computer1.processor = "intel core i5";
        computer1.memory = "8 GB";
        computer1.HDD = "256 GB";
        computer1.price = "50 000₽";

        System.out.println(computer1.model);
        System.out.println(computer1.processor);
        System.out.println(computer1.memory);
        System.out.println(computer1.HDD);
        System.out.println(computer1.price);

        Computer computer2 = new Computer2();
        computer2.model = "ACER";
        computer2.processor = "intel core i3";
        computer2.memory = "8 GB";
        computer2.HDD = "128 GB";
        computer2.price = "30 000₽";
        System.out.println(computer2.model);
        System.out.println(computer2.processor);
        System.out.println(computer2.memory);
        System.out.println(computer2.HDD);
        System.out.println(computer2.price);
    }


private static class Computer  {
    public String price;
    public String HDD;
    public String model;
    public String processor;
    public String memory;
}

private static class Computer1 extends Computer {

    public String price;

    public String HDD;

    public String model;

    public String processor;

    public String memory;
}
private static class Computer2 extends Computer1 {

    public String price;

    public String HDD;

    public String model;

    public String processor;

    public String memory;
}
}