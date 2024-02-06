package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.registerEncoder */
public final /* synthetic */ class registerEncoder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ registerEncoder(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        this.MediaBrowserCompat$CustomActionResultReceiver = defaultHeartBeatInfo;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.MediaBrowserCompat$CustomActionResultReceiver;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.mo36012x50fd9e4a(String.valueOf(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token));
        bVar.write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver));
        bVar.mo36017b_(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver());
    }
}
