package personTest;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Vasy", 45);
        Person person2 = new Person("Pety", 23);

        person1.setName("Natalia");
        person2.setAge(11);

        System.out.println("имя первого человека " + person1.getName());
        System.out.println("имя второго человека " + person2.getName());

        changeNames(person1, person2);

        System.out.println("!!!and!!!");
        System.out.println("имя первого человека " + person1.getName());
        System.out.println("имя второго человека " + person2.getName());
        System.out.println("а их возраст " + person1.getAge() + " and " + person2.getAge());

    }
    public static void changeNames(Person vasy, Person pety) {
        String tempMemory = vasy.getName();
        vasy.setName(pety.getName());
        pety.setName(tempMemory);
    }
}
