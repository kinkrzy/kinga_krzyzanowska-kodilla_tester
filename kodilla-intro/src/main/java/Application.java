public class Application{
    public static void main(String[] args) {
        UserData userData = new UserData("Adam",40.5,178);
        {
            if (userData.age > 30 && userData.height > 160)
                System.out.println("User is older than 30 and taller than 160cm");
            if (userData.age <30 && userData.height <160)
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
