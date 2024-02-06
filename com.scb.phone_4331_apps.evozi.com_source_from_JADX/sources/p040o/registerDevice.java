package p040o;

import com.scb.phone.view.activity.deeplink.CardActivationDeepLinkActivity;

/* renamed from: o.registerDevice */
public final /* synthetic */ class registerDevice implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ CardActivationDeepLinkActivity read;

    public /* synthetic */ registerDevice(CardActivationDeepLinkActivity cardActivationDeepLinkActivity) {
        this.read = cardActivationDeepLinkActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.write((notifyBackgroundStateChangeListeners) obj);
    }
}
