package Anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * JAVA 中有以下几个『元注解』：

 @Target：注解的作用目标
 @Retention：注解的生命周期
 @Documented：注解是否应当被包含在 JavaDoc 文档中
 @Inherited：是否允许子类继承该注解


 ElementType.TYPE：允许被修饰的注解作用在类、接口和枚举上
 ElementType.FIELD：允许作用在属性字段上
 ElementType.METHOD：允许作用在方法上
 ElementType.PARAMETER：允许作用在方法参数上
 ElementType.CONSTRUCTOR：允许作用在构造器上
 ElementType.LOCAL_VARIABLE：允许作用在本地局部变量上
 ElementType.ANNOTATION_TYPE：允许作用在注解上
 ElementType.PACKAGE：允许作用在包上

 JAVA 的内置三大注解
 @Override
 @Deprecated 被标记不推荐使用
 @SuppressWarnings 压制警告
 */

@Retention(RetentionPolicy.RUNTIME)
@interface   MyAnno {


    String str() default "Testing";
    int val()default 5;
}
