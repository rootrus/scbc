package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.TrimmedThrowableData */
public final /* synthetic */ class TrimmedThrowableData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo write;

    public /* synthetic */ TrimmedThrowableData(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        this.write = defaultHeartBeatInfo;
    }

    public final void IconCompatParcelizer(Object obj) {
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.mo36017b_(this.write.MediaBrowserCompat$ItemReceiver());
        bVar.MediaBrowserCompat$MediaItem();
    }
}
