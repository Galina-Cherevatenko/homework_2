package homework_2.task_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        exceptional ();}

    public static void exceptional () {
        try {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = in.nextLine();
        System.out.println("Давай попробуем снова");
        while (!in.nextLine().toLowerCase().equals("отстань от меня, пожалуйста"))
                System.out.println("Давай попробуем снова");
        in.close();
        throw new Exception ();
        }

        catch (Exception e) {System.out.println("Ха-ха! Попался, я поймал исключение!"); }
        finally {System.out.println ("До свидания");}

        }
}
