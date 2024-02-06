package p040o;

import java.net.URI;

/* renamed from: o.PreregistrationLandingActivity */
public abstract class PreregistrationLandingActivity extends RegistrationOnboardingActivity implements RemittanceCoachmarkActivity_ViewBinding, RegistrationTermsAndConsActivity {
    gotoFindUs IconCompatParcelizer;
    public URI MediaBrowserCompat$ItemReceiver;
    ReviewAccountsActivity read;

    public abstract String aW_();

    public final ReviewAccountsActivity MediaBrowserCompat$ItemReceiver() {
        ReviewAccountsActivity reviewAccountsActivity = this.read;
        if (reviewAccountsActivity != null) {
            return reviewAccountsActivity;
        }
        AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write = write();
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(write, "HTTP parameters");
        Object IconCompatParcelizer2 = write.IconCompatParcelizer("http.protocol.version");
        if (IconCompatParcelizer2 == null) {
            return ManageAccountInboundActivity.IconCompatParcelizer;
        }
        return (ReviewAccountsActivity) IconCompatParcelizer2;
    }

    public final URI MediaDescriptionCompat() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final ManageNotificationsActivity MediaBrowserCompat$MediaItem() {
        String aW_ = aW_();
        ReviewAccountsActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        URI uri = this.MediaBrowserCompat$ItemReceiver;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new PaymentInfoAdapter$ViewTypeTextHolder(aW_, aSCIIString, MediaBrowserCompat$ItemReceiver2);
    }

    public final gotoFindUs read() {
        return this.IconCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(aW_());
        sb.append(" ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(" ");
        sb.append(MediaBrowserCompat$ItemReceiver());
        return sb.toString();
    }
}
