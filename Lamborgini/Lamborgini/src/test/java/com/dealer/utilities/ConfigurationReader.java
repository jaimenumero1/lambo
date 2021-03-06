package com.dealer.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try{
            String path = "src/test/resources/lambo.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            System.out.println(properties);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}
