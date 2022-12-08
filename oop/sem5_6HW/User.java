package oop.sem5_6HW;

import java.util.Scanner;

class User {
    public User(String name, Chat chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    String name;
    private Chat chatroom;
    int intvitation;
    
    public void setChatroom(Chat chatroom) {
        this.chatroom = chatroom;
    }

    void intvitation(User user, Chat chat){
        
        System.out.print("Do you want to tet-a-tet with me?");
        Scanner in = new Scanner(System.in);
       
        if(in.next().equals("y")){
            user.setChatroom(chat);
            chatroom.appendClient(user);
        }else{
            System.out.println("Ok. It means next times, bye");
        }
        in.close();
    }

    void printMessage(String msg) {
        System.out.printf("Chat %s: %s\n", name, msg);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }
}
