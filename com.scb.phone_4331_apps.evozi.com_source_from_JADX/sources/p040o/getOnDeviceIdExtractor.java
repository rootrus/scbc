package p040o;

import p040o.C4176cd;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOnDeviceIdExtractor */
public final /* synthetic */ class getOnDeviceIdExtractor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4176cd IconCompatParcelizer;

    public /* synthetic */ getOnDeviceIdExtractor(C4176cd cdVar) {
        this.IconCompatParcelizer = cdVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4176cd cdVar = this.IconCompatParcelizer;
        KtaJsonCheck.RatingCompat ratingCompat = (KtaJsonCheck.RatingCompat) obj;
        if (cdVar.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() || cdVar.IconCompatParcelizer.read()) {
            if (cdVar.RatingCompat != null) {
                cdVar.RatingCompat.AlertController$RecycleListView();
            }
            cdVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            cdVar.MediaBrowserCompat$ItemReceiver.write();
            cdVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4176cd.read());
            return;
        }
        ratingCompat.read();
    }
}
