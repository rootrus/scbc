package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.FirebaseApp;
import p040o.Maps;

/* renamed from: o.FirebaseMLException */
public final /* synthetic */ class FirebaseMLException implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getContour MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ chain write;

    public /* synthetic */ FirebaseMLException(getContour getcontour, chain chain) {
        this.MediaBrowserCompat$ItemReceiver = getcontour;
        this.write = chain;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getContour getcontour = this.MediaBrowserCompat$ItemReceiver;
        onOpen onopen = (onOpen) obj;
        String str2 = this.write.MediaDescriptionCompat;
        Maps.C36434 r2 = getcontour.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) onopen, "cardResponse");
        boolean z = false;
        FirebaseApp.GlobalBackgroundStateListener globalBackgroundStateListener = new FirebaseApp.GlobalBackgroundStateListener((byte) 0);
        String str3 = onopen.MediaBrowserCompat$ItemReceiver;
        if (str3 == null) {
            str3 = "";
        }
        globalBackgroundStateListener.MediaBrowserCompat$ItemReceiver = str3;
        globalBackgroundStateListener.read = Maps.C36434.write(Double.valueOf(onopen.MediaBrowserCompat$CustomActionResultReceiver));
        OffsetDateTime offsetDateTime = onopen.write;
        if (offsetDateTime != null) {
            str = r2.IconCompatParcelizer("dd MMM yyyy", offsetDateTime);
        } else {
            str = null;
        }
        globalBackgroundStateListener.IconCompatParcelizer = str;
        if (!AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(globalBackgroundStateListener.IconCompatParcelizer) && str2.equals(globalBackgroundStateListener.MediaBrowserCompat$ItemReceiver)) {
            z = true;
        }
        getcontour.write(z, new onMessageReceived(globalBackgroundStateListener));
    }
}
