package p040o;

import java.util.List;

/* renamed from: o.createParcelList */
public final /* synthetic */ class createParcelList implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ isGooglePlayServicesUid IconCompatParcelizer;

    public /* synthetic */ createParcelList(isGooglePlayServicesUid isgoogleplayservicesuid) {
        this.IconCompatParcelizer = isgoogleplayservicesuid;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((List) obj);
    }
}
