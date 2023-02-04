public class Main {
    public static void main(String[] args) {
        //Test Exercice 1
        //new Exercice1().displayInfo();

        //Test Exercice 2
        //new Exercice2().execute();

        //Test Exercice 3
        Person person1 = new Person();
        System.out.println(person1.displayInfo());
        Person person2 = new Person("Pandor", 45, 'F');
        System.out.println(person2.displayInfo());
        Person person3 = new Person("Coris", 25);
        System.out.println(person3.displayInfo());
    }
}