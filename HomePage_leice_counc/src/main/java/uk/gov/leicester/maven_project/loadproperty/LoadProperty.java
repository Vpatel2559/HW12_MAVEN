package uk.gov.leicester.maven_project.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    static Properties prop;

    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty (String key){
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\uk\\gov\\leicester\\maven_project\\resourses\\config.properties");
            prop.load(input);
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
