package Lambda;

public class LambdaDemoParamImpl {
    public static void main(String[] args) {
       /* LambdaDemoParam lambdaDemoParam=(n)->(n%2)==0;
        System.out.println(lambdaDemoParam);
        if(lambdaDemoParam.test(10)){
            System.out.println("10 is even");
        }*/
       LambdaDemoParam lambdaDemoParam=(n)->(n)=="1";
        if (lambdaDemoParam.test("1")){
            System.out.println("0000");
        }
        if(lambdaDemoParam.test("10")){
            System.out.println("10 is even");
        }
    }


}
