package com.company;
import java.util.*;

public class Main {
    public static ArrayList<MessageList> m1List = new ArrayList<MessageList>();
    public static void main(String[] args) {

        Scanner kbReader = new Scanner (System.in);
        System.out.println("Do you (1) want to send a message or (2) delete a message");
        int log = kbReader.nextInt();
        if(log==1)
        {
            System.out.println("Enter recipient's name");
            String recip = kbReader.nextLine();
            System.out.println("Enter message");
            String mes = kbReader.nextLine();
            Message m = new Message(recip,mes);
            m1List.add(m);
        }
        if(log==2)
        {

        }
    }
}
