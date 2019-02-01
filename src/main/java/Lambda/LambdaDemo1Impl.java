package Lambda;




class LambdaDemo1Impl {
    interface LambdaDemo1 {
        double getValue();
    }

    public static void main(String[] args) {
        LambdaDemo1 lambdaDemo1;
        lambdaDemo1=() -> 123.45;
        lambdaDemo1=() ->Math.random()*100;
        System.out.println(lambdaDemo1.getValue());


    }

}
