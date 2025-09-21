
public class q3_person {
    String name;
    int age;

    q3_person(String n, int a) {
        name = n; age = a;
    }

    q3_person(q3_person other) {
        name = other.name;
        age = other.age;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        q3_person p1 = new q3_person("alice8", 39);
        q3_person p2 = new q3_person(p1);
        p1.show();
        p2.show();
    }
}
