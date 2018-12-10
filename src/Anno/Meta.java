package Anno;


import java.lang.reflect.Method;

public class Meta {
    @MyAnno
    public static void myMeta(){
        Meta meta = new Meta();
        try {
            Class<?> c = meta.getClass();
            Method myMeta = c.getMethod("myMeta");
            MyAnno annotation = myMeta.getAnnotation(MyAnno.class);

            System.out.println(annotation.str()+"  "+annotation.val());

        }catch (Exception e){
            System.out.println("Method Not Found");
        }

    }

    public static void main(String[] args) {
        myMeta();
    }
}
