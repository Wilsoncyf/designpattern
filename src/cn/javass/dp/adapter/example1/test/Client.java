package cn.javass.dp.adapter.example1.test;

public class Client {
    public static void main(){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }

}
