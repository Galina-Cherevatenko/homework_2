package homework_2.task_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Что бы поделать?");
        if (in.nextLine().equals("Ничего не делай"))
            System.out.println("Пойду бездельничать");
        else {
        System.out.println("Что бы еще поделать?");
        while (!in.nextLine().equals("Ничего не делай"))
        System.out.println("Что бы еще поделать?");
        System.out.println("Пойду бездельничать");}
        in.close();
    }}
