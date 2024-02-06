package p040o;

import java.util.List;
import p040o.AppStatsSessionEvent;
import p040o.ICheckExtractorListener;
import p040o.TransformedImmutableList;
import p040o.writeUInt64NoTag;

/* renamed from: o.exportStatusEvent */
public final /* synthetic */ class exportStatusEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AppStatsSessionEvent.C30373 read;

    public /* synthetic */ exportStatusEvent(AppStatsSessionEvent.C30373 r1, List list) {
        this.read = r1;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        AppStatsSessionEvent.C30373 r0 = this.read;
        List list = this.MediaBrowserCompat$ItemReceiver;
        ICheckExtractorListener.MediaDescriptionCompat mediaDescriptionCompat = (ICheckExtractorListener.MediaDescriptionCompat) obj;
        mediaDescriptionCompat.aj_();
        TransformedImmutableList.C38711 write = AppStatsSessionEvent.this.MediaMetadataCompat;
        boolean itemInvoker = AppStatsSessionEvent.this.write.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
        onGetStartedClick.write((Object) list, "list");
        List MediaBrowserCompat$ItemReceiver2 = TransformedImmutableList.C38711.MediaBrowserCompat$ItemReceiver(list, new TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver(write, itemInvoker, false));
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "transformList(list) { tr…t, isMasked, isSummary) }");
        mediaDescriptionCompat.read(MediaBrowserCompat$ItemReceiver2);
    }
}
