package p040o;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ssl.SSLInitializationException;

@Deprecated
/* renamed from: o.GiftingMoneyReviewActivity */
public final class GiftingMoneyReviewActivity implements GiftRecipientActivity, GiftPreviewActivity {
    private static GiftingPresentReviewActivity MediaBrowserCompat$ItemReceiver = new GiftingAboutActivity();
    private volatile GiftingPresentReviewActivity IconCompatParcelizer;
    private final String[] MediaBrowserCompat$CustomActionResultReceiver;
    private final String[] read;
    private final SSLSocketFactory write;

    static {
        new onCloseTutorial();
        new goToHome();
    }

    public static GiftingMoneyReviewActivity MediaBrowserCompat$ItemReceiver() throws SSLInitializationException {
        return new GiftingMoneyReviewActivity(GiftingActivity_ViewBinding.write(), MediaBrowserCompat$ItemReceiver);
    }

    private GiftingMoneyReviewActivity(SSLContext sSLContext, GiftingPresentReviewActivity giftingPresentReviewActivity) {
        this(((SSLContext) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(sSLContext, "SSL context")).getSocketFactory(), giftingPresentReviewActivity);
    }

    private GiftingMoneyReviewActivity(SSLSocketFactory sSLSocketFactory, GiftingPresentReviewActivity giftingPresentReviewActivity) {
        this.write = (SSLSocketFactory) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(sSLSocketFactory, "SSL socket factory");
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.read = null;
        this.IconCompatParcelizer = giftingPresentReviewActivity == null ? MediaBrowserCompat$ItemReceiver : giftingPresentReviewActivity;
    }

    public final Socket IconCompatParcelizer(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException, UnknownHostException, ConnectTimeoutException {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inetSocketAddress, "Remote address");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        if (inetSocketAddress instanceof onUnscheduleClick) {
            privacyManagementLandingViewHolder = ((onUnscheduleClick) inetSocketAddress).read;
        } else {
            privacyManagementLandingViewHolder = new PrivacyManagementLandingViewHolder(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        }
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        int MediaBrowserCompat$ItemReceiver2 = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.socket.timeout", 0);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        int MediaBrowserCompat$ItemReceiver3 = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.connection.timeout", 0);
        socket.setSoTimeout(MediaBrowserCompat$ItemReceiver2);
        return MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3, socket, privacyManagementLandingViewHolder, inetSocketAddress, inetSocketAddress2);
    }

    public final boolean read(Socket socket) throws IllegalArgumentException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(socket, "Socket");
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalStateException("Socket not created by this factory");
        } else if (!socket.isClosed()) {
            return true;
        } else {
            throw new IllegalStateException("Socket is closed");
        }
    }

    public final Socket read(Socket socket, String str, int i) throws IOException, UnknownHostException {
        return MediaBrowserCompat$CustomActionResultReceiver(socket, str, i);
    }

    public final Socket MediaBrowserCompat$ItemReceiver(Socket socket, String str, int i) throws IOException, UnknownHostException {
        return MediaBrowserCompat$CustomActionResultReceiver(socket, str, i);
    }

    private Socket MediaBrowserCompat$CustomActionResultReceiver(int i, Socket socket, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "HTTP host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = SocketFactory.getDefault().createSocket();
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            if (!(socket instanceof SSLSocket)) {
                return MediaBrowserCompat$CustomActionResultReceiver(socket, privacyManagementLandingViewHolder.write, inetSocketAddress.getPort());
            }
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.startHandshake();
            try {
                this.IconCompatParcelizer.read(privacyManagementLandingViewHolder.write, sSLSocket);
                return socket;
            } catch (IOException e) {
                try {
                    sSLSocket.close();
                } catch (Exception unused) {
                }
                throw e;
            }
        } catch (SocketTimeoutException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Connect to ");
            sb.append(inetSocketAddress);
            sb.append(" timed out");
            throw new ConnectTimeoutException(sb.toString());
        }
    }

    private Socket MediaBrowserCompat$CustomActionResultReceiver(Socket socket, String str, int i) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.write.createSocket(socket, str, i, true);
        sSLSocket.startHandshake();
        try {
            this.IconCompatParcelizer.read(str, sSLSocket);
            return sSLSocket;
        } catch (IOException e) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e;
        }
    }

    public final Socket MediaBrowserCompat$CustomActionResultReceiver(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        return SocketFactory.getDefault().createSocket();
    }
}
