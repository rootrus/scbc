package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImagePerfectionProfile */
public final /* synthetic */ class setImagePerfectionProfile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C3490x49eb2967 read;

    public /* synthetic */ setImagePerfectionProfile(C3490x49eb2967 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver, Throwable th) {
        this.read = imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C3490x49eb2967 imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver = this.read;
        ((CheckExtractActivity_MembersInjector.setCheckable) obj).MediaBrowserCompat$ItemReceiver(imageProcessor$ProcessProgressEvent$MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
