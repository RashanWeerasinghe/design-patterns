public class ComputerShop {
    public static void main(String[] args) {

        Computer k1=new ComputerBuilder().setBrand("Dell").setRam(16).getComputer();

        Computer k2=new ComputerBuilder().setRam(16).getComputer();


        System.out.println(k1);
        System.out.println(k2);
    }
}