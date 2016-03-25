/**
 1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
 @ заменяется на [ at ]
 . заменяется на [ dot ]

 Пример ввода:
 person@gmail.com
 Результат:
 person[ at ]gmail[ dot ]com

 */
public class Home_04_01_Exchage_Symbols {

    public static void main(String[] args) {
        String str = "vdoarme@gmail.com";
        System.out.println(AutoExchangeMailAddressService(str));
    }

    public static String AutoExchangeMailAddressService (String email) {

        email = email.replace("@", "[at]");
        email = email.replace(".", "[dot]");
        return email;
    }

}
