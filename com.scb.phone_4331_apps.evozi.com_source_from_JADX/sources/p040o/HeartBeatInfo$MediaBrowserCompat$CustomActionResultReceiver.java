package p040o;

import p040o.C7507tQ;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver */
public final class HeartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read> {
    private /* synthetic */ HeartBeatInfo IconCompatParcelizer;

    public HeartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver(HeartBeatInfo heartBeatInfo) {
        this.IconCompatParcelizer = heartBeatInfo;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        C7507tQ.read read = (C7507tQ.read) obj;
        double IconCompatParcelizer2 = this.IconCompatParcelizer.write;
        CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.read;
        if (MediaBrowserCompat$ItemReceiver != null) {
            str = MediaBrowserCompat$ItemReceiver.f2695x50fd9e4a;
        } else {
            str = null;
        }
        read.MediaBrowserCompat$CustomActionResultReceiver(String.valueOf(IconCompatParcelizer2), str);
    }
}
