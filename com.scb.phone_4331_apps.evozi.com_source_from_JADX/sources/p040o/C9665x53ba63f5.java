package p040o;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.ProtocolException;

@Deprecated
/* renamed from: o.BaseExpandableRecycleViewAdapter$BaseParentViewHolder_ViewBinding */
public class C9665x53ba63f5 extends ChequeDetailListAdapter$ChequeItemHolder implements RemittanceCoachmarkActivity_ViewBinding {
    int IconCompatParcelizer;
    final PrivacyConsentActivity MediaBrowserCompat$ItemReceiver;
    private ReviewAccountsActivity RatingCompat;
    private String read;
    URI write;

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return false;
    }

    public boolean MediaMetadataCompat() {
        return true;
    }

    public C9665x53ba63f5(PrivacyConsentActivity privacyConsentActivity) throws ProtocolException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        this.MediaBrowserCompat$ItemReceiver = privacyConsentActivity;
        IconCompatParcelizer(privacyConsentActivity.write());
        IconCompatParcelizer(privacyConsentActivity.aV_());
        if (privacyConsentActivity instanceof RemittanceCoachmarkActivity_ViewBinding) {
            RemittanceCoachmarkActivity_ViewBinding remittanceCoachmarkActivity_ViewBinding = (RemittanceCoachmarkActivity_ViewBinding) privacyConsentActivity;
            this.write = remittanceCoachmarkActivity_ViewBinding.MediaDescriptionCompat();
            this.read = remittanceCoachmarkActivity_ViewBinding.aW_();
            this.RatingCompat = null;
        } else {
            ManageNotificationsActivity MediaBrowserCompat$MediaItem = privacyConsentActivity.MediaBrowserCompat$MediaItem();
            try {
                this.write = new URI(MediaBrowserCompat$MediaItem.read());
                this.read = MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
                this.RatingCompat = privacyConsentActivity.MediaBrowserCompat$ItemReceiver();
            } catch (URISyntaxException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid request URI: ");
                sb.append(MediaBrowserCompat$MediaItem.read());
                throw new ProtocolException(sb.toString(), e);
            }
        }
        this.IconCompatParcelizer = 0;
    }

    public final void MediaSessionCompat$Token() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.clear();
        IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.aV_());
    }

    public final String aW_() {
        return this.read;
    }

    public final ReviewAccountsActivity MediaBrowserCompat$ItemReceiver() {
        ReviewAccountsActivity reviewAccountsActivity;
        if (this.RatingCompat == null) {
            AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write2 = write();
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(write2, "HTTP parameters");
            Object IconCompatParcelizer2 = write2.IconCompatParcelizer("http.protocol.version");
            if (IconCompatParcelizer2 == null) {
                reviewAccountsActivity = ManageAccountInboundActivity.IconCompatParcelizer;
            } else {
                reviewAccountsActivity = (ReviewAccountsActivity) IconCompatParcelizer2;
            }
            this.RatingCompat = reviewAccountsActivity;
        }
        return this.RatingCompat;
    }

    public final URI MediaDescriptionCompat() {
        return this.write;
    }

    public final ManageNotificationsActivity MediaBrowserCompat$MediaItem() {
        ReviewAccountsActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        URI uri = this.write;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new PaymentInfoAdapter$ViewTypeTextHolder(this.read, aSCIIString, MediaBrowserCompat$ItemReceiver2);
    }
}
