package Phone;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        p1.about();
        p2.about();
        p3.about();
        p1.recieveCall("Sister");
        p2.recieveCall("Brother");
        p3.recieveCall("Mother");
        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());
        System.out.println(p3.getNumber());
        p1.recieveCall("Sister", "7778945");
        p2.recieveCall("Brother", "7892346");
        p3.recieveCall("Mother", "5649512");
        p1.sendMessage("111", "222", "333");
        p2.sendMessage("555", "666", "777");
        p3.sendMessage("999", "101010", "111111");
    }

}
