package p040o;

import p040o.CrashlyticsReport;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.ObjectEncoderContext */
public final /* synthetic */ class ObjectEncoderContext implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DefaultHeartBeatInfo write;

    public /* synthetic */ ObjectEncoderContext(DefaultHeartBeatInfo defaultHeartBeatInfo, CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.write = defaultHeartBeatInfo;
        this.MediaBrowserCompat$ItemReceiver = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo defaultHeartBeatInfo = this.write;
        RttiJsonCheck.C7042b bVar = (RttiJsonCheck.C7042b) obj;
        bVar.read(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
        bVar.mo36017b_(defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver());
    }
}
