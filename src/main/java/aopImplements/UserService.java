package aopImplements;

/*
AOP 实现方式
 */
public interface UserService {
    default void User(){
        System.out.println(1);
    }

    void addUser();
    void updateUser();
    void deleteUser();

}