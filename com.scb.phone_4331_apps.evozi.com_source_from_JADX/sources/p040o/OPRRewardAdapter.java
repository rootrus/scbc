package p040o;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.HttpException;

@Deprecated
/* renamed from: o.OPRRewardAdapter */
public final class OPRRewardAdapter extends C9731xd43d39d5 implements PaginationViewFooterHolder {
    private final Socket MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver = false;

    /* renamed from: o.OPRRewardAdapter$RewardViewHolder */
    public interface RewardViewHolder {
        int MediaDescriptionCompat();
    }

    /* renamed from: o.OPRRewardAdapter$RewardViewHolder_ViewBinding */
    public interface RewardViewHolder_ViewBinding<T extends PrivacyManagementLandingActivity> {
        void write(T t) throws IOException, HttpException;
    }

    public OPRRewardAdapter(Socket socket, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(socket, "Socket");
        this.MediaBrowserCompat$CustomActionResultReceiver = socket;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        MediaBrowserCompat$ItemReceiver(socket.getInputStream(), i < 1024 ? 1024 : i, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }

    /* access modifiers changed from: protected */
    public final int write() throws IOException {
        int write = super.write();
        this.MediaBrowserCompat$ItemReceiver = write == -1;
        return write;
    }

    /* JADX INFO: finally extract failed */
    public final boolean write(int i) throws IOException {
        boolean MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        int soTimeout = this.MediaBrowserCompat$CustomActionResultReceiver.getSoTimeout();
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.setSoTimeout(i);
            this.MediaBrowserCompat$ItemReceiver = super.write() == -1;
            boolean MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$CustomActionResultReceiver.setSoTimeout(soTimeout);
            return MediaBrowserCompat$ItemReceiver3;
        } catch (Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
