package p040o;

import com.scb.phone.view.activity.deeplink.CardActivationDeepLinkActivity;

/* renamed from: o.logout */
public final /* synthetic */ class logout implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CardActivationDeepLinkActivity read;

    public /* synthetic */ logout(CardActivationDeepLinkActivity cardActivationDeepLinkActivity) {
        this.read = cardActivationDeepLinkActivity;
    }

    public final Object write(Object obj) {
        return skipBytes.MediaBrowserCompat$ItemReceiver((getHandler) obj);
    }
}
