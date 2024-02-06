package p040o;

import java.util.List;
import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAppSettingsData */
public final /* synthetic */ class getAppSettingsData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getAppSettingsData(String str, String str2, List list) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).read(new ListenableFutureTask(CrashlyticsReportJsonTransform$$Lambda$8.PROVINCE, this.read, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, (String) null));
    }
}
