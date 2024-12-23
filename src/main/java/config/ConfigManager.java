package config;

import enums.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {





       public static final   Properties properties=new Properties();

       public static final   Logger logger= LogManager.getLogger();


    static {
        loadConfigProperties();
    }

       public static void loadConfigProperties()    {

           try {

               FileInputStream baseConfig = new FileInputStream("src/main/resources/config/config.properties");
               properties.load(baseConfig);
               baseConfig.close();

                Environment env=Environment.valueOf(properties.getProperty("env").toUpperCase());
               String envpath="src/main/resources/config/"+env.name().toLowerCase() +"-config.properties";

               FileInputStream envConfig=new FileInputStream(envpath);
              properties.load(envConfig);
              envConfig.close();

              logger.info(env+ "has been loaded ");



           }catch (IOException e){

               logger.error("failed to load configuration"+e);
               throw  new RuntimeException("configuration load failed");

           }

       }


 public static String getProperty(String key){

     return  properties.getProperty(key);

 }




    public static void main(String[] args)   {
        System.out.println(properties.getProperty("browser"));

    }






}
