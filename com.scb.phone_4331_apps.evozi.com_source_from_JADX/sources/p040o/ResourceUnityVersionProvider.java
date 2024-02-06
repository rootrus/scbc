package p040o;

import p040o.DefaultHeartBeatInfo;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.ResourceUnityVersionProvider */
public final /* synthetic */ class ResourceUnityVersionProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzxj MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DefaultHeartBeatInfo.C33171 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ResourceUnityVersionProvider(DefaultHeartBeatInfo.C33171 r1, zzxj zzxj) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzxj;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo.C33171 r0 = this.MediaBrowserCompat$ItemReceiver;
        zzxj zzxj = this.MediaBrowserCompat$CustomActionResultReceiver;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        if (!zzxj.read.isEmpty()) {
            isTerminated isterminated = DefaultHeartBeatInfo.this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
            if (isterminated != null) {
                bVar.write(DefaultHeartBeatInfo.this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(zzxj), isterminated);
            } else {
                bVar.write(DefaultHeartBeatInfo.this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(zzxj));
            }
        } else {
            bVar.MediaBrowserCompat$MediaItem(zzxj.write);
        }
    }
}
