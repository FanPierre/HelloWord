package aopImplements;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add");
    }

    @Override
    public void updateUser() {
        System.out.println("updatd");

    }

    @Override
    public void deleteUser() {
        System.out.println("delete");

    }
}
