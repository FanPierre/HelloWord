package Gen;

public class Gen2 extends Gen<String> {


    public Gen2(String ob) {
        super(ob);
    }

    @Override
    public String getOb() {
        System.out.println("You called String getob():");
        return ob;
    }
}
