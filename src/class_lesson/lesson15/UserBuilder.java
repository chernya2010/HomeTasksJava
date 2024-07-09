package class_lesson.lesson15;

public interface UserBuilder {

    User create(String name);

    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Dan");
        System.out.println(user.getName());
    }
}
