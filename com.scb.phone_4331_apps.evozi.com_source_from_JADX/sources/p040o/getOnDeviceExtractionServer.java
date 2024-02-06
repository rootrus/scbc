package p040o;

import java.util.List;
import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOnDeviceExtractionServer */
public final /* synthetic */ class getOnDeviceExtractionServer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4176cd write;

    public /* synthetic */ getOnDeviceExtractionServer(C4176cd cdVar) {
        this.write = cdVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        KtaJsonCheck.RatingCompat ratingCompat = (KtaJsonCheck.RatingCompat) obj;
        List<access$lambda$0> list = this.write.MediaMetadataCompat;
        if (list != null) {
            ratingCompat.MediaBrowserCompat$ItemReceiver(list);
        } else {
            ratingCompat.MediaBrowserCompat$ItemReceiver();
        }
    }
}
