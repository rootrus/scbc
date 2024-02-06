package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.ObjectEncoder */
public final /* synthetic */ class ObjectEncoder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ DefaultHeartBeatInfo MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ObjectEncoder(DefaultHeartBeatInfo defaultHeartBeatInfo, int i) {
        this.MediaBrowserCompat$ItemReceiver = defaultHeartBeatInfo;
        this.IconCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.MediaBrowserCompat$ItemReceiver;
        int i = this.IconCompatParcelizer;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.mo36017b_(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver());
        bVar.MediaMetadataCompat(getICheckDeserializerRtti.IconCompatParcelizer(true, true, defaultHeartBeatInfo.MediaBrowserCompat$SearchResultReceiver.get(i).write));
    }
}
