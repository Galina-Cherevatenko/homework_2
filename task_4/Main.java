package homework_2.task_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Введите количество слов:");
        n = in.nextInt();
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> sortedList = new ArrayList<>();
        ArrayList<String> anagram = new ArrayList<>();

        String world;
        System.out.println("Введите слова:");
        for (int i = 0; i < n; i++) {
            world = scan.nextLine();
            list.add(world);
        }
        for (int i = 0; i < n; i++) {
            char[] chArr = list.get(i).toLowerCase().toCharArray(); //перевод в массив символов
            for (int k = chArr.length - 1; k > 0; k--) //сортировка символов
            {
                for (int j = 0; j < k; j++) {
                    if (chArr[j] > chArr[j + 1]) {
                        char tmp = chArr[j];
                        chArr[j] = chArr[j + 1];
                        chArr[j + 1] = tmp;
                    }
                }
            }
            String valueOfchar = String.valueOf(chArr); //перевод в строку
            sortedList.add(valueOfchar);
        }
        //поиск одинаковых слов
        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = i + 1; j < sortedList.size(); j++) {
                if (sortedList.get(i).equals(sortedList.get(j)))
                    anagram.add(sortedList.get(i));
            }
        }

        sortedList.removeAll(anagram); // удаление повторяющихся слов из отсортированного массива

        System.out.println("Анаграммы:");
        for(int i = 0; i< anagram.size(); i++) {
            System.out.println(anagram.get(i));
        }
        System.out.println("Не анаграммы:");
        for(int i = 0; i< sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }
}