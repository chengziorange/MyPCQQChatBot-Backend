package top.orange233.mpq.chatbot;

import java.io.IOException;

/**
 * @author Cheng Tao
 * @date 2020/3/10
 */
public class Main {

    public static void main(String[] args) {
        try {
            HttpServerService hss = new HttpServerService(18089);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
