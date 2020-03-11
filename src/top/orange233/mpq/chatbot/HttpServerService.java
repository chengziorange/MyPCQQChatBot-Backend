package top.orange233.mpq.chatbot;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * @author Cheng Tao
 * @date 2020/3/10
 */
public class HttpServerService {
    private HttpServer mServer;
    private boolean hasContext;

    public HttpServerService(int port) throws IOException {
        this.mServer = HttpServer.create(new InetSocketAddress(port), 0);
        hasContext = false;
    }

    public void createServerContext(String path, HttpHandler handler) {
        mServer.createContext(path, handler);
        hasContext = true;
    }

    @SuppressWarnings("AlibabaThreadPoolCreation")
    public void startServer() {
        try {
            if (!hasContext) {
                throw new Exception("There's no Context of the server.");
            }
            mServer.setExecutor(Executors.newFixedThreadPool(10));
            mServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
