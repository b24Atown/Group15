package IQ.pages;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();
    static {
        try{
            //open the file using inputStream
            FileInputStream inputStream = new FileInputStream("configuration.properties");

            //load to properties
            properties.load(inputStream);
            //close the file after loading
            inputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occured while reading configuration file");
        }


    }
    public static String getProperty(String key) {
        return  properties.getProperty(key);
    }
}
