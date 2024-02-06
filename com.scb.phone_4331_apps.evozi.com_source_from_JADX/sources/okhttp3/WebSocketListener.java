package okhttp3;

import p040o.SCBUniversalWebViewActivity_ViewBinding;
import p040o.onGetStartedClick;

public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        onGetStartedClick.write((Object) webSocket, "webSocket");
        onGetStartedClick.write((Object) str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        onGetStartedClick.write((Object) webSocket, "webSocket");
        onGetStartedClick.write((Object) str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        onGetStartedClick.write((Object) webSocket, "webSocket");
        onGetStartedClick.write((Object) th, "t");
    }

    public void onMessage(WebSocket webSocket, String str) {
        onGetStartedClick.write((Object) webSocket, "webSocket");
        onGetStartedClick.write((Object) str, "text");
    }

    public void onMessage(WebSocket webSocket, SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) {
        onGetStartedClick.write((Object) webSocket, "webSocket");
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity_ViewBinding, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        onGetStartedClick.write((Object) webSocket, "webSocket");
        onGetStartedClick.write((Object) response, "response");
    }
}
