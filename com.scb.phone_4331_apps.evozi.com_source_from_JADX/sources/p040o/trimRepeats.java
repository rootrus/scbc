package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.trimRepeats */
public final /* synthetic */ class trimRepeats implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DefaultHeartBeatInfo read;

    public /* synthetic */ trimRepeats(DefaultHeartBeatInfo defaultHeartBeatInfo, String str) {
        this.read = defaultHeartBeatInfo;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.read;
        String str = this.MediaBrowserCompat$ItemReceiver;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.mo36017b_(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver());
        bVar.IconCompatParcelizer();
        bVar.read(12, getICheckDeserializerRtti.IconCompatParcelizer(false, true, str));
    }
}
