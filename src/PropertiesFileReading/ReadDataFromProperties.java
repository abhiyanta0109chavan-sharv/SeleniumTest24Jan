package PropertiesFileReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {
   public static void main(String[] args) throws IOException {
        //create file
        FileInputStream myFile = new FileInputStream("C:\\Users\\Win-10\\IdeaProjects\\SeleniumProject\\application.properties");

        //To read from properties file create obj of Properties file and then load file
        Properties obj = new Properties();
        obj.load(myFile);

        //read Data
        String Value = obj.getProperty("UN");
        System.out.println("Username is "+Value);

        System.out.println("Application env is "+obj.getProperty("en"));

        System.out.println("Password is "+obj.getProperty("PSW"));

        System.out.println("Mobile no is "+obj.get("MobileNo"));


    }
}
