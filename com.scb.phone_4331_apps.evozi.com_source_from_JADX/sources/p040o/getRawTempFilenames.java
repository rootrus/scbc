package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRawTempFilenames */
public final /* synthetic */ class getRawTempFilenames implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ getRawTempFilenames(String str, int i) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).MediaBrowserCompat$SearchResultReceiver(this.read.substring(0, this.MediaBrowserCompat$ItemReceiver));
    }
}
