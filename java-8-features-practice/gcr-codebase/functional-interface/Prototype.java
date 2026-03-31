public class Prototype implements Cloneable {

    int value = 100;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
