package cn.javass.dp.singleton.example4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    /**
     * 用来存放配置文件中参数A的值
     */
    private String parameterA;
    /**
     * 用来存放配置文件中参数B的值
     */
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }
    public String getParameterB() {
        return parameterB;
    }


    private static AppConfig appConfig = new AppConfig();

    public static AppConfig getInstance() {
        return appConfig;
    }

    private  AppConfig() {
        readConfig();
    }

    private void readConfig() {
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = AppConfig.class.getResourceAsStream("Appconfig.properties");
            properties.load(in);
            this.parameterA = properties.getProperty("paramA");
            this.parameterB = properties.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
