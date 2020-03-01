package top.orange233.mpq.chatbot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            HttpServerService hss = new HttpServerService(18089);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
