package p040o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;

@Deprecated
/* renamed from: o.GiftSelectionActivity */
public final class GiftSelectionActivity implements GiftingActivity {
    public final boolean read(Socket socket) {
        return false;
    }

    public final Socket MediaBrowserCompat$CustomActionResultReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        return new Socket();
    }

    public final Socket IconCompatParcelizer(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException, ConnectTimeoutException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inetSocketAddress, "Remote address");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        if (socket == null) {
            socket = new Socket();
        }
        if (inetSocketAddress2 != null) {
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
            socket.setReuseAddress(amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.socket.reuseaddr", false));
            socket.bind(inetSocketAddress2);
        }
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        int MediaBrowserCompat$ItemReceiver = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.timeout", 0);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        try {
            socket.setSoTimeout(amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.socket.timeout", 0));
            socket.connect(inetSocketAddress, MediaBrowserCompat$ItemReceiver);
            return socket;
        } catch (SocketTimeoutException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Connect to ");
            sb.append(inetSocketAddress);
            sb.append(" timed out");
            throw new ConnectTimeoutException(sb.toString());
        }
    }
}
