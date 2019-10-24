package uk.co.ebay.mavenproject.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream input;

    String projectpath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectpath + "\\src\\test\\java\\uk\\co\\ebay\\mavenproject\\resourses\\propertiesfiles\\config.properties");
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }


}
