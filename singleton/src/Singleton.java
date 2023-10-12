public class Singleton {

    private Singleton(){}
    static Singleton sin=null;
    public static Singleton getInstance(){
        return sin==null?sin=new Singleton():sin;
    }
}
























