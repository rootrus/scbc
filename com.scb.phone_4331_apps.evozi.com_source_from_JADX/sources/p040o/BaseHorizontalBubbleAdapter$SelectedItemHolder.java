package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpException;

@Deprecated
/* renamed from: o.BaseHorizontalBubbleAdapter$SelectedItemHolder */
public final class BaseHorizontalBubbleAdapter$SelectedItemHolder extends ReviewActivity implements DealsSuccessActivity, SequentialSearchActivity, CreditCardBilledDetailAdapter$ParentViewHolder {
    private volatile boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$ItemReceiver = PrepaidOtpActivity.write((Class) getClass());
    private final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$MediaItem = PrepaidOtpActivity.read("org.apache.http.wire");
    private volatile Socket MediaDescriptionCompat;
    private final PrepaidTravelCoachMarkActivity_ViewBinding read = PrepaidOtpActivity.read("org.apache.http.headers");
    private final Map<String, Object> write = new HashMap();

    public final boolean MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Socket RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    public final SSLSession MediaSessionCompat$Token() {
        if (this.MediaDescriptionCompat instanceof SSLSocket) {
            return ((SSLSocket) this.MediaDescriptionCompat).getSession();
        }
        return null;
    }

    public final void write(Socket socket) throws IOException {
        MediaSessionCompat$QueueItem();
        this.MediaDescriptionCompat = socket;
        if (this.IconCompatParcelizer) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    public final void IconCompatParcelizer(boolean z, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "Parameters");
        MediaSessionCompat$QueueItem();
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        IconCompatParcelizer(this.MediaDescriptionCompat, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }

    public final void read() throws IOException {
        this.IconCompatParcelizer = true;
        try {
            super.read();
            if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Connection ");
                sb.append(this);
                sb.append(" shut down");
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
            Socket socket = this.MediaDescriptionCompat;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("I/O error shutting down connection", e);
        }
    }

    public final void close() throws IOException {
        try {
            super.close();
            if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Connection ");
                sb.append(this);
                sb.append(" closed");
                prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
            }
        } catch (IOException e) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("I/O error closing connection", e);
        }
    }

    public final OPRRewardTiersAdapter$TierViewHolder_ViewBinding IconCompatParcelizer(Socket socket, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        if (i <= 0) {
            i = 8192;
        }
        OPRRewardTiersAdapter$TierViewHolder_ViewBinding IconCompatParcelizer2 = super.IconCompatParcelizer(socket, i, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        return this.MediaBrowserCompat$MediaItem.IconCompatParcelizer() ? new DepositViewPagerAdapter$ItemViewHolder_ViewBinding(IconCompatParcelizer2, new ErrorPagerAdapter_ViewBinding(this.MediaBrowserCompat$MediaItem), AlertController$RecycleListView.read(amountDetailsSuccessAdapter$SuccessRow_ViewBinding)) : IconCompatParcelizer2;
    }

    public final OPRRewardTiersAdapter$TierViewHolder MediaBrowserCompat$CustomActionResultReceiver(Socket socket, int i, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        if (i <= 0) {
            i = 8192;
        }
        OPRRewardTiersAdapter$TierViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = super.MediaBrowserCompat$CustomActionResultReceiver(socket, i, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        return this.MediaBrowserCompat$MediaItem.IconCompatParcelizer() ? new LoanViewPagerAdapter$ItemViewHolder(MediaBrowserCompat$CustomActionResultReceiver2, new ErrorPagerAdapter_ViewBinding(this.MediaBrowserCompat$MediaItem), AlertController$RecycleListView.read(amountDetailsSuccessAdapter$SuccessRow_ViewBinding)) : MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final PaginationViewFooterHolder_ViewBinding<ScbPrivacyPolicyActivity> MediaBrowserCompat$CustomActionResultReceiver(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, ManageAccountInboundActivity_ViewBinding manageAccountInboundActivity_ViewBinding, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        return new C9791xd5b92518(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, manageAccountInboundActivity_ViewBinding, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }

    public final void MediaBrowserCompat$ItemReceiver(Socket socket, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, boolean z, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        MediaMetadataCompat();
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Target host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "Parameters");
        if (socket != null) {
            this.MediaDescriptionCompat = socket;
            IconCompatParcelizer(socket, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final ScbPrivacyPolicyActivity MediaBrowserCompat$ItemReceiver() throws HttpException, IOException {
        ScbPrivacyPolicyActivity MediaBrowserCompat$ItemReceiver2 = super.MediaBrowserCompat$ItemReceiver();
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Receiving response: ");
            sb.append(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer());
            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
        }
        if (this.read.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.read;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<< ");
            sb2.append(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer().toString());
            prepaidTravelCoachMarkActivity_ViewBinding2.write(sb2.toString());
            for (PrepaidRequestMarketConductActivity obj : MediaBrowserCompat$ItemReceiver2.aV_()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding3 = this.read;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("<< ");
                sb3.append(obj.toString());
                prepaidTravelCoachMarkActivity_ViewBinding3.write(sb3.toString());
            }
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final void MediaBrowserCompat$ItemReceiver(PrivacyConsentActivity privacyConsentActivity) throws HttpException, IOException {
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Sending request: ");
            sb.append(privacyConsentActivity.MediaBrowserCompat$MediaItem());
            prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
        }
        super.MediaBrowserCompat$ItemReceiver(privacyConsentActivity);
        if (this.read.IconCompatParcelizer()) {
            PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding2 = this.read;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(">> ");
            sb2.append(privacyConsentActivity.MediaBrowserCompat$MediaItem().toString());
            prepaidTravelCoachMarkActivity_ViewBinding2.write(sb2.toString());
            for (PrepaidRequestMarketConductActivity obj : privacyConsentActivity.aV_()) {
                PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding3 = this.read;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(">> ");
                sb3.append(obj.toString());
                prepaidTravelCoachMarkActivity_ViewBinding3.write(sb3.toString());
            }
        }
    }

    public final Object MediaBrowserCompat$ItemReceiver(String str) {
        return this.write.get(str);
    }

    public final void write(String str, Object obj) {
        this.write.put(str, obj);
    }
}
