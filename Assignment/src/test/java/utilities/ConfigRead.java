package utilities;

import com.github.javafaker.Faker;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ConfigRead {
    private static Properties defaultProps = new Properties();
    static {
        try {
            String currentDir = System.getProperty("user.dir");
            String filepath=currentDir+"/src/test/java/Config/config.properties";
            FileInputStream in = new FileInputStream(filepath);
            defaultProps.load(in);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key) {
        return defaultProps.getProperty(key);
    }
    /**
     * generates random Computer name
     * @return random Computer name
     */
    public static String getComputerName(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }
    /**
     * gets date
     * @return  date
     */
    public static String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return formatter.format(date);
    }

    /**
     * gets companys name hardcoded
     * @return company name
     */
    public static String getCompanyName(){
        return "RCA";
    }



}
