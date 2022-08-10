package task;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public void writeText() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("metn.txt"));) {
            bufferedWriter.write("Sun Microsystems tarafından geliştirilmiş olan Java ilk kez 1995 yılında piyasaya sunuldu.\nJava geniş kullanım alanına sahip, sınıf tabanlı, nesne yönelimli olarak tanımlanan bir programlama dilidir. \nJava aynı zamanda uygulama geliştirme ve çalıştırma çalışmaları yapılan bir bilgi işlem platformudur. \nJava ayrıca son kullanıcının ücretsiz olarak indirerek kullanabileceği bir uygulama çalıştırma yazılımıdır. ");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void readText() {
        Map<String, Integer> tekrar = new HashMap<>();

        String line;
        int count = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("metn.txt"));) {
            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(" ");
                for (String soz : words) {
                 if (tekrar.containsKey(soz)){
                     Integer say = tekrar.get(soz);
                     tekrar.put(soz,++say);
                 }
                 else {
                     tekrar.put(soz,1);
                 }


                }
                count = count + words.length;
                System.out.println("Number of words : " + count);


            }
            System.out.println(tekrar);
        } catch (Exception e) {
            System.out.println("");
        }

    }

}

