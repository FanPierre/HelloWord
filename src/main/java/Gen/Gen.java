package Gen;

public class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

}
