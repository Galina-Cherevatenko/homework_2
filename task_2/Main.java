package homework_2.task_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Что бы поделать?");
        String str2 = in.nextLine();
        System.out.println("Что бы еще поделать?");
        while (!in.nextLine().equals("Ничего не делай"))
        System.out.println("Что бы еще поделать?");


        System.out.println("Пойду бездельничать");
        in.close();
    }}
