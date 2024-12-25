package wordsGenerator;
import java.util.ArrayList;
import java.util.List;

public class WordGener {
    private static List<String> createWordList(int size){
        List<String> words = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            words.add("Слово" + i);
        }return words;
    }

    public static void main(String[] args) {
        List<String> wordsOne = createWordList(9);
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
                "портал", "период времени", "обзор", "образец", "пункт следования"};

        int rand1 = (int) (Math.random() * wordList1.length);
        int rand2 = (int) (Math.random() * wordList2.length);
        int rand3 = (int) (Math.random() * wordList3.length);

        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
