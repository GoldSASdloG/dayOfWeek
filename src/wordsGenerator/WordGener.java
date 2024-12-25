package wordsGenerator;
import java.util.ArrayList;
import java.util.List;

public class WordGener {


    public static void main(String[] args) {
        List<String> wordsOne = createWordList(10);
        System.out.println(wordsOne);

        List<String> wordsTwo = createWordList(7);
        System.out.println(wordsTwo);

        List<String> wordsTree = createWordList(5);
        System.out.println(wordsTree);

        String[] wordList1 = {"круглосуточный", "трех-звенный", "взаимный",
                "обоюдный выигрыш", "проникающий", "умный", "меттод критического пути",
                "динамичный", "всего лишь-то", "не все могут смотреть",
                "правильно переносимый", "там где нужно"};

        String[] wordList2 = {"уполномоченный", "трудный", "чистый продукт",
                "ориентированный", "центральный", "распределенный", "фирменный",
                "нестандартный ум", "позиционированный", "не только лишь все",
                "сетевой", "сфокусированный"};

        String[] wordList3 = {"процесс", "пункт разгрузки", "выход из положения",
                "тип структуры", "талант", "подход", "уровень завоеванного внимания",
                "портал", "период времени", "обзор",
                "образец", "пункт следования"};

        int oneLength = wordList1.length;
        int twoLength = wordList2.length;
        int threeLength = wordList3.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
        System.out.println("Все, что нам нужно, - это " + phrase);
    }
    private static List<String> createWordList(int size){
        List<String> words = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            words.add("Слово" + i);
        }return words;
    }
}
