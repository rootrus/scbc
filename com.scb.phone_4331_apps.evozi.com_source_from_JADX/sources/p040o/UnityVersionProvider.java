package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.UnityVersionProvider */
public final /* synthetic */ class UnityVersionProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ double IconCompatParcelizer;
    private final /* synthetic */ DefaultHeartBeatInfo MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ isTerminated read;

    public /* synthetic */ UnityVersionProvider(DefaultHeartBeatInfo defaultHeartBeatInfo, isTerminated isterminated, double d) {
        this.MediaBrowserCompat$ItemReceiver = defaultHeartBeatInfo;
        this.read = isterminated;
        this.IconCompatParcelizer = d;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.MediaBrowserCompat$ItemReceiver;
        isTerminated isterminated = this.read;
        double d = this.IconCompatParcelizer;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.MediaBrowserCompat$CustomActionResultReceiver(isterminated);
        bVar.MediaBrowserCompat$SearchResultReceiver(isterminated.MediaSessionCompat$ResultReceiverWrapper);
        bVar.IconCompatParcelizer(true);
        bVar.MediaBrowserCompat$CustomActionResultReceiver(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo != null ? defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver.doubleValue() : Double.MAX_VALUE, d);
    }
}
