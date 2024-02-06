package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.TransportRegistrar */
public final /* synthetic */ class TransportRegistrar implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo write;

    public /* synthetic */ TransportRegistrar(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        this.write = defaultHeartBeatInfo;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonCheck.C7042b) obj).RatingCompat(this.write.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.IconCompatParcelizer);
    }
}
