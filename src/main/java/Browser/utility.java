package Browser;

import java.io.FileReader;
import java.util.Properties;

public class utility {
    public static String properties(String data) throws Exception{  //browser
        String propertiesData = null;
        try{
            String filePath = System.getProperty("user.dir")+"//src//main//resources//configure.properties";
            FileReader reader = new FileReader(filePath);
            Properties p = new Properties();
            p.load(reader);
            propertiesData = p.getProperty(data);   //url
        } catch (Exception e){
            System.out.println("Properties: " + e);
        }
        return propertiesData;
    }

    public static void main(String[] args) throws Exception{
        System.out.println("browser");   //from configuration.properties
        System.out.println("url");
    }
}


