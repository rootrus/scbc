package p040o;

import p040o.setUseErrorMsgAsOnlyMessage;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUseErrorMsgAsOnlyMessage$write$MediaBrowserCompat$CustomActionResultReceiver */
final class C5387x29aa4e93<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule> {
    private /* synthetic */ String read;
    private /* synthetic */ setUseErrorMsgAsOnlyMessage.write write;

    C5387x29aa4e93(setUseErrorMsgAsOnlyMessage.write write2, String str) {
        this.write = write2;
        this.read = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver("yyyy-MM-dd", this.read);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "dateDisplayMapper.transf…                        )");
        ((PassportCaptureModule) obj).IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
    }
}
