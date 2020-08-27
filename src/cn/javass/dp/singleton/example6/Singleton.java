package cn.javass.dp.singleton.example6;

public class Singleton {
    private Singleton(){}
    private static  Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
