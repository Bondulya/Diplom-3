package ToDo;

import com.github.javafaker.Faker;
import java.util.Random;

public class Randomize {

    public static String getRandomName() {
        String randomName = new Faker().name().firstName();
        return randomName;
    }

    public static String getRandomEmail() {
        Faker faker = new Faker();
        String randomEmail = faker.name().lastName().toLowerCase() +
                faker.number().digits(4) +
                "@yandex.ru";
        return randomEmail;
    }

    public static String getRandomPassword(int length) {
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            password[i] = chars.charAt(random.nextInt(chars.length()));
        }
        return new String(password);
    }
}
