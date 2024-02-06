package p040o;

import java.util.List;
import p040o.C4027ai;
import p040o.CheckParameters_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getZoomInMsg */
public final /* synthetic */ class getZoomInMsg implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4027ai.C40281.IconCompatParcelizer IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getZoomInMsg(C4027ai.C40281.IconCompatParcelizer iconCompatParcelizer, List list) {
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (CheckParameters_MembersInjector.ParcelableVolumeInfo) obj);
    }
}
