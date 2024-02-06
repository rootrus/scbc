package p040o;

import java.util.List;
import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppSettingsData */
public final /* synthetic */ class AppSettingsData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ AppSettingsData(String str, String str2, List list, String str3) {
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(new ListenableFutureTask(CrashlyticsReportJsonTransform$$Lambda$8.POSTAL_CODE, this.write, this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver));
    }
}
