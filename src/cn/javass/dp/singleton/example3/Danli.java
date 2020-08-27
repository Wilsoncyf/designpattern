package cn.javass.dp.singleton.example3;

public class Danli {
    private static Danli danli = new Danli();

    private  Danli() {
    }

    public static Danli getDanli() {
        return danli;
    }

}
