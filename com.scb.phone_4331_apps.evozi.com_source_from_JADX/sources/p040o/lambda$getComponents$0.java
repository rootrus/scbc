package p040o;

import p040o.DefaultHeartBeatInfo;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.lambda$getComponents$0 */
public final /* synthetic */ class lambda$getComponents$0 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ lambda$getComponents$0(DefaultHeartBeatInfo.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((RttiJsonCheck.C7042b) obj).MediaBrowserCompat$ItemReceiver(DefaultHeartBeatInfo.this.MediaBrowserCompat$ItemReceiver, DefaultHeartBeatInfo.this.MediaBrowserCompat$MediaItem);
    }
}
