public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
        name = "Unknown";
        age = 0;
        gender = 'U';
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        gender = 'U';
    }

    public String displayInfo() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
