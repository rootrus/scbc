package p040o;

import java.util.List;
import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.Settings */
public final /* synthetic */ class Settings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ List read;
    private final /* synthetic */ String write;

    public /* synthetic */ Settings(String str, String str2, List list, String str3) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(new ListenableFutureTask(CrashlyticsReportJsonTransform$$Lambda$8.SUB_DISTRICT, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.MediaBrowserCompat$ItemReceiver));
    }
}
