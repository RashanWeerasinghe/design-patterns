public class Main {
    public static void main(String[] args) {

        Singleton sin1=Singleton.getInstance();
        Singleton sin2=Singleton.getInstance();
        System.out.println(sin1==sin2);
    }
}