package okhttp3.internal.p089ws;

import java.io.Closeable;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p089ws.RealWebSocket;
import p040o.onGetStartedClick;

/* renamed from: okhttp3.internal.ws.RealWebSocket$connect$1 */
public final class RealWebSocket$connect$1 implements Callback {
    final /* synthetic */ Request $request;
    final /* synthetic */ RealWebSocket this$0;

    RealWebSocket$connect$1(RealWebSocket realWebSocket, Request request) {
        this.this$0 = realWebSocket;
        this.$request = request;
    }

    public final void onResponse(Call call, Response response) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) response, "response");
        Exchange exchange = response.exchange();
        try {
            this.this$0.checkUpgradeSuccess$okhttp(response, exchange);
            if (exchange == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("OkHttp WebSocket ");
                sb.append(this.$request.url().redact());
                this.this$0.initReaderAndWriter(sb.toString(), newWebSocketStreams);
                this.this$0.getListener$okhttp().onOpen(this.this$0, response);
                this.this$0.loopReader();
            } catch (Exception e) {
                this.this$0.failWebSocket(e, (Response) null);
            }
        } catch (IOException e2) {
            if (exchange != null) {
                exchange.webSocketUpgradeFailed();
            }
            this.this$0.failWebSocket(e2, response);
            Util.closeQuietly((Closeable) response);
        }
    }

    public final void onFailure(Call call, IOException iOException) {
        onGetStartedClick.write((Object) call, "call");
        onGetStartedClick.write((Object) iOException, "e");
        this.this$0.failWebSocket(iOException, (Response) null);
    }
}
