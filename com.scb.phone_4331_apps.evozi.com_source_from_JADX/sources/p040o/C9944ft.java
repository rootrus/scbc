package p040o;

import p040o.C4442fy;
import p040o.getCompressedFrontImageSize;
import p040o.writeUInt64NoTag;

/* renamed from: o.ft */
public final /* synthetic */ class C9944ft implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ animateCameraWithDurationAndCallback MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4442fy.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C9944ft(C4442fy.write write, animateCameraWithDurationAndCallback animatecamerawithdurationandcallback) {
        this.MediaBrowserCompat$ItemReceiver = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = animatecamerawithdurationandcallback;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4442fy.write write = this.MediaBrowserCompat$ItemReceiver;
        ((getCompressedFrontImageSize.write) obj).MediaBrowserCompat$CustomActionResultReceiver(C4442fy.this.read.write(write.write, write.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, write.read, (String) null, C4442fy.this.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker(), ""), write.MediaBrowserCompat$ItemReceiver);
    }
}
