package pages;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Load_Property {
    static Properties prop;
    static FileInputStream input;
    static String filelocation="src/main/java/config/config.properties";

    public String getProperty(String KeyName){
        prop = new Properties();

        try {
            input=new FileInputStream(filelocation);
            prop.load(input);
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(KeyName);
    }
}
