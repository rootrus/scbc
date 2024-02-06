package p040o;

import com.scb.phone.view.activity.cardmanagement.CardActivationActivity;
import p040o.setTitleMarginStart;

/* renamed from: o.iS */
public final /* synthetic */ class C7163iS implements setTitleMarginStart.IconCompatParcelizer {
    private final /* synthetic */ CardActivationActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7163iS(CardActivationActivity cardActivationActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = cardActivationActivity;
    }

    public final void write() {
        CardActivationActivity cardActivationActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cardActivationActivity.getSupportFragmentManager().write() > 0) {
            cardActivationActivity.mo11B_();
            cardActivationActivity.mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
            return;
        }
        cardActivationActivity.setStackedBackground();
    }
}
