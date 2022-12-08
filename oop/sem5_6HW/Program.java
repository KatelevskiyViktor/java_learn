package oop.sem5_6HW;

public class Program {
    public static void main(String[] args) {
        MiniChatik miniChatik = new MiniChatik();
        TetATet tetaATet = new TetATet();
        User client1 = new User("Ora", miniChatik);
        User client2 = new User("Vegat", miniChatik);
        User client4 = new User("Marshu", miniChatik);
        miniChatik.appendClient(client1);
        miniChatik.appendClient(client2);
        miniChatik.appendClient(client4);

        client1.sendMsg("Hi everyone!");
        client2.sendMsg("Hi-Hi!");

        User client3 = new User("Mistuf", miniChatik);
        miniChatik.appendClient(client3);

        client3.sendMsg("Good to see you again!");


        client1.setChatroom(tetaATet);
        tetaATet.appendClient(client1);
        client1.intvitation(client2, tetaATet);
        
        
        client1.sendMsg("Hi");
        client4.setChatroom(tetaATet);
        tetaATet.appendClient(client4);
        
    }
}
