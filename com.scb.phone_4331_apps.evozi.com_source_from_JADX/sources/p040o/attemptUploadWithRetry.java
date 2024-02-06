package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.attemptUploadWithRetry */
public final /* synthetic */ class attemptUploadWithRetry implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ attemptUploadWithRetry(String str, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule.C6375a.MediaDescriptionCompat) obj).read(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.write);
    }
}
