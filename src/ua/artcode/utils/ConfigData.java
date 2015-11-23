package ua.artcode.utils;

import org.openqa.selenium.By;

import java.io.*;
import java.util.Properties;

/**
 * Created by ViTaLES on 10.10.2015.
 */
public class ConfigData {


    //TODO  Maven
    public static String uiMappingFile = "src/UIMapping.properties";

    public static String getValueFromFile(String key, String fileName) throws IOException {
        Properties p = new Properties();

            p.load(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));

        return (p.getProperty(key));
    }


    public static By ui(String key) throws IOException {
        String[] partsOfLocators = getValueFromFile(key, uiMappingFile).split("\"");
        String findMetod = partsOfLocators[0].substring(0, partsOfLocators[0].length() - 1);
        String target = partsOfLocators[1];

 /*       System.out.println(key);                //Logo
        System.out.println(partsOfLocators[0]); //cssSelector(
        System.out.println(findMetod);          //cssSelector
        System.out.println(target);             //.ellos.active*/

        // name.
        if(findMetod.equals("id")){
            return By.id(target);
        } else {
            if (findMetod.equals("xpath")) {
                return By.xpath(target);
            } else {
                if (findMetod.equals("cssSelector")){
                    return By.cssSelector(target);
                } else {
                    return By.partialLinkText(target);
                }
            }
        }


    }


}
