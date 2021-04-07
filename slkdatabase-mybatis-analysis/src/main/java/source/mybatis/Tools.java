package source.mybatis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Tools {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(random.nextInt(10000));
        }
    }

    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(date);
    }


}
