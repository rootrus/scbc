package p040o;

import p040o.DefaultHeartBeatInfo;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.RemoveRepeatsStrategy */
public final /* synthetic */ class RemoveRepeatsStrategy implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo.C33162 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ RemoveRepeatsStrategy(DefaultHeartBeatInfo.C33162 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo.C33162 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.MediaBrowserCompat$CustomActionResultReceiver();
        bVar.IconCompatParcelizer(((getContents) DefaultHeartBeatInfo.this.MediaBrowserCompat$SearchResultReceiver.get(DefaultHeartBeatInfo.this.MediaMetadataCompat)).IconCompatParcelizer);
    }
}
