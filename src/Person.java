public class Person {
    private String mName;                   //imię i nazwisko razem
    private int mAge;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) { mName = name; }
    public String getName() { return mName; }
    public void setAge(int age) { mAge = age; }
    public int getAge() { return mAge; }
}
