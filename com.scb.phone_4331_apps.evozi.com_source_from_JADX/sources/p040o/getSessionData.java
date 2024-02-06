package p040o;

import java.util.List;
import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSessionData */
public final /* synthetic */ class getSessionData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ getSessionData(String str, String str2, List list, String str3) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(new ListenableFutureTask(CrashlyticsReportJsonTransform$$Lambda$8.DISTRICT, this.write, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
