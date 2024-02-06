package p040o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

@Deprecated
/* renamed from: o.ReviewActivity */
public class ReviewActivity extends EditFavouriteActivity implements PrivacyManagementLandingActivity_ViewBinding {
    private volatile Socket IconCompatParcelizer = null;
    private volatile boolean MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$QueueItem() {
        if (!(!this.MediaBrowserCompat$ItemReceiver)) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaMetadataCompat() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    public OPRRewardTiersAdapter$TierViewHolder_ViewBinding IconCompatParcelizer(Socket socket, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        return new OPRRewardAdapter(socket, i, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }

    public OPRRewardTiersAdapter$TierViewHolder MediaBrowserCompat$CustomActionResultReceiver(Socket socket, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        return new MyECouponViewHolder_ViewBinding(socket, i, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Socket socket, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(socket, "Socket");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        this.IconCompatParcelizer = socket;
        int MediaBrowserCompat$ItemReceiver2 = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.socket.buffer-size", -1);
        IconCompatParcelizer(IconCompatParcelizer(socket, MediaBrowserCompat$ItemReceiver2, amountDetailsSuccessAdapter$SuccessRow_ViewBinding), MediaBrowserCompat$CustomActionResultReceiver(socket, MediaBrowserCompat$ItemReceiver2, amountDetailsSuccessAdapter$SuccessRow_ViewBinding), amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: protected */
    public Socket RatingCompat() {
        return this.IconCompatParcelizer;
    }

    public final InetAddress MediaBrowserCompat$SearchResultReceiver() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getInetAddress();
        }
        return null;
    }

    public final int MediaDescriptionCompat() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getPort();
        }
        return -1;
    }

    public void read() throws IOException {
        this.MediaBrowserCompat$ItemReceiver = false;
        Socket socket = this.IconCompatParcelizer;
        if (socket != null) {
            socket.close();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:8:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = r2.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r2.MediaBrowserCompat$ItemReceiver = r0
            java.net.Socket r0 = r2.IconCompatParcelizer
            r2.MediaSessionCompat$ResultReceiverWrapper()     // Catch:{ all -> 0x0017 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0013, UnsupportedOperationException -> 0x0013 }
        L_0x0013:
            r0.close()
            return
        L_0x0017:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ReviewActivity.close():void");
    }

    private static void read(StringBuilder sb, SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            sb.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
            sb.append(':');
            sb.append(inetSocketAddress.getPort());
            return;
        }
        sb.append(socketAddress);
    }

    public String toString() {
        if (this.IconCompatParcelizer == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        SocketAddress remoteSocketAddress = this.IconCompatParcelizer.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.IconCompatParcelizer.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            read(sb, localSocketAddress);
            sb.append("<->");
            read(sb, remoteSocketAddress);
        }
        return sb.toString();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            throw new IllegalStateException("Connection is not open");
        } else if (this.IconCompatParcelizer != null) {
            try {
                this.IconCompatParcelizer.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }
}
