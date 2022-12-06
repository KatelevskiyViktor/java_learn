package oop.sem5HW;

import java.util.ArrayList;

public class TetATet implements Chat{
    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User me) {
        for (User user : users) {
            if (user.name != me.name) {
                user.printMessage(msg);
            }
        }
        
    }

    @Override
    public void appendClient(User client) {
        if(users.size() < 2){
            System.out.println("\n >>> add to chat " + client.name);
            users.add(client);
        }else{
            System.out.println("\n Sorry " + client.name + " this chat only for two person");
        }
        
        
    }
    
}
