package demoqa.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
     //Bu class'in amaci confugiration.properties dosyasindaki verileri(test data) okumaktir.
    // creat Properties instance

    private static Properties properties;
    //FileInputStream kullanarak bir dosya aciyoruz
    //Properties bir dosyaya yukluyoruz

    //baslatmak icin statik blok olusturduk.

    static {
        String path = "configuration.properties";
        try {
            FileInputStream file = new FileInputStream(path); //FileInPutStream kullanarak bir dosya aciyoruz
            properties = new Properties();
            properties.load(file); // Propertiesi bu dosyaya yukluyoruz
        } catch (Exception e) {
            System.out.println("file path bulunamadi");
            e.printStackTrace();

        }

    }

    //Okumak icin bir static method olusuturuyoruz
    //Bu method kullanici anahtar kelimeyi girdiginde(key) value return eder.
   public static String getProperty(String key) {
          return properties.getProperty(key);
   }


}
