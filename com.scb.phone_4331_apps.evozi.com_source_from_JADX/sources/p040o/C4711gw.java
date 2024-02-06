package p040o;

import java.util.List;
import p040o.LogFileManager;

/* renamed from: o.gw */
public final /* synthetic */ class C4711gw implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C4767hi MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ C4711gw(C4767hi hiVar, String str, String str2, String str3) {
        this.MediaBrowserCompat$ItemReceiver = hiVar;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4767hi hiVar = this.MediaBrowserCompat$ItemReceiver;
        String str = this.write;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        List MediaBrowserCompat$ItemReceiver2 = AbstractService.MediaBrowserCompat$ItemReceiver((List) obj, new tryReleaseShared(hiVar.MediaBrowserCompat$ItemReceiver));
        boolean z = false;
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.size(); i++) {
            parseEventSignal parseeventsignal = (parseEventSignal) MediaBrowserCompat$ItemReceiver2.get(i);
            if (str.equalsIgnoreCase(String.valueOf(parseeventsignal.MediaDescriptionCompat))) {
                parseeventsignal.MediaBrowserCompat$MediaItem();
                LogFileManager.C35981 MediaBrowserCompat$CustomActionResultReceiver = LogFileManager.C35981.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = str2;
                MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = str3;
                C4745hd hdVar = new C4745hd(parseeventsignal, MediaBrowserCompat$CustomActionResultReceiver);
                if (hiVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    hdVar.IconCompatParcelizer(hiVar.RatingCompat);
                    return;
                }
                return;
            }
        }
    }
}
