package singleton;

public class Client {

    public static void main(String[] args) {
       Singleton s1 = Singleton.getInstance();
       Singleton s2 = Singleton.getInstance();

        System.out.println("s1 Object: "+s1+"\ns2 Object: "+s2);
    }
}
