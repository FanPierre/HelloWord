package methodQuote;

public class MyStringOps {
    static  String strReverses(String str){
        String result="";
        int i;
        for (i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);

        }
        return result;
    }


}
