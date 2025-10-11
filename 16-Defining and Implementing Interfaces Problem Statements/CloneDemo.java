class Model implements Cloneable {
    int id = 1;
    String name = "Base";
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) throws Exception {
        Model m1 = new Model();
        Model m2 = (Model) m1.clone();
        System.out.println("Cloned: " + m2.name);
    }
}