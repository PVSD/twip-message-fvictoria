package com.company;
import java.util.*;
public class Main {
    public static ArrayList<MessageList> m1List = new ArrayList<MessageList>();
    public static void main(String[] args) {

        Scanner kbReader = new Scanner (System.in);
        System.out.println("Do you (1) want to send a message or (2) delete a message");
        int res = kbReader.nextInt();
        if(res==1)
        {
            System.out.println("Enter recipient's name");
            String recip = kbReader.nextLine();
            System.out.println("Enter message");
            String mes = kbReader.nextLine();

        }
        if(res==2)
        {

        }
    }
}
