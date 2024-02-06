package okhttp3;

import p040o.SCBUniversalWebViewActivity_ViewBinding;

public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding);
}
