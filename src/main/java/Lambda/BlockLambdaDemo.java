package Lambda;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc numericFunc=(n) ->{
            int result=1;
            for (int i=1;i<n;i++)
               result= result+i;

            return  result;
        };
    }
}
