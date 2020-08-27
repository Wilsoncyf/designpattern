package cn.javass.dp.singleton.example2;

public class Danli {

    private static Danli danli = null;

    private Danli() {
    }

    public static synchronized Danli getDanli() {
        if (danli == null) {
            danli = new Danli();
        }
        return danli;
    }
}
