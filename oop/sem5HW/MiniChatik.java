package oop.sem5HW;

import java.util.ArrayList;

public class MiniChatik implements Chat {
    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String text, User me) {

        for (User user : users) {
            if (user.name != me.name) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User client) {
        System.out.println("\n >>> add " + client.name);
        users.add(client);

    }
}
