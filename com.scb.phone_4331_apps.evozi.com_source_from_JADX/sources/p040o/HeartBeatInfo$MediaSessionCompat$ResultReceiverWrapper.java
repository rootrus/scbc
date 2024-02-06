package p040o;

import p040o.C7507tQ;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfo$MediaSessionCompat$ResultReceiverWrapper */
public final class HeartBeatInfo$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<C7507tQ.read> {
    private /* synthetic */ HeartBeatInfo MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ double write;

    public HeartBeatInfo$MediaSessionCompat$ResultReceiverWrapper(HeartBeatInfo heartBeatInfo, double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver = heartBeatInfo;
        this.write = d;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((C7507tQ.read) obj).MediaBrowserCompat$ItemReceiver(!HeartBeatInfo.MediaBrowserCompat$CustomActionResultReceiver(HeartBeatInfo.write(this.MediaBrowserCompat$CustomActionResultReceiver), this.write));
    }
}
