class President{
    //private instanse early Instantiation
    private static President president=new President();
    private String name;
    private int age;
    private President (){}
    // public method to return single instance
    public static President getInstance(){
        return president;
    }
    public String toString(){
        return "Name is "+name +" And Age is "+ age+" "+this;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        President president=President.getInstance();
        president.setName("John Kalson");
        president.setAge(56);
        System.out.println("Our President "+president);
        President president2=President.getInstance();
        president2.setName("John Kalson2");
        president2.setAge(562);
        System.out.println("Our President "+president2);
        System.out.println(president2);
        System.out.println(president);
    }
}