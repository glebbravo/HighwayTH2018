package lesson8;

public class UserMain {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Flash";
        user1.age = 25;
        User user2 = new User();
        user2.name = "Gleb";
        user2.age = 22;
        user2.city = "Kiev";
        System.out.println(user1.name + user1.age + user1.profession);
        System.out.println(user2.name + user2.age + user2.profession);


    }
}