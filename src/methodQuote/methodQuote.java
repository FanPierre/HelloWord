package methodQuote;

public class methodQuote {

    static  String stringop(StringFunc sf,String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr="lambdas add power to java";
        String outStr;
        outStr=stringop(MyStringOps::strReverses,inStr);
        System.out.println("out: "+outStr);
        System.out.println("inS: "+inStr);
    }

}
