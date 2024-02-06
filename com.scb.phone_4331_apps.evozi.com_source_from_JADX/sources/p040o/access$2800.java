package p040o;

import com.scb.phone.view.activity.partner.PartnerConsentActivity;

/* renamed from: o.access$2800 */
public final /* synthetic */ class access$2800 implements Runnable {
    private final /* synthetic */ PartnerConsentActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ access$2800(PartnerConsentActivity partnerConsentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = partnerConsentActivity;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat(false);
    }
}
