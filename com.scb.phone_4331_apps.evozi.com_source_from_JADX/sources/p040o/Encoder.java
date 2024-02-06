package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.Encoder */
public final /* synthetic */ class Encoder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo read;

    public /* synthetic */ Encoder(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        this.read = defaultHeartBeatInfo;
    }

    public final void IconCompatParcelizer(Object obj) {
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.mo36017b_(this.read.MediaBrowserCompat$ItemReceiver());
        bVar.write();
    }
}
